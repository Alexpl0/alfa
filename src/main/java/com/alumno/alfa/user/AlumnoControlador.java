package com.alumno.alfa.user;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;

@RestController
@RequestMapping("/alumno")
public class AlumnoControlador {
    @Autowired
    private AlumnoRepositorio repositorio;
    
    @GetMapping
    public List<Alumno> getAlumnos(){
        return repositorio.findAll();
    }

    @GetMapping("/{id}")
    public Alumno getAlumnoById(@PathVariable Long id){
        return repositorio.findById(id).get();
    }

    @PostMapping
    public Alumno createAlumno(@RequestBody Alumno alumno){
        return repositorio.save(alumno);
    }
    
    @PutMapping("/{id}")
    public Alumno updateAlumno(@PathVariable Long id, @RequestBody Alumno alumno){
        Alumno alumnoActual = repositorio.findById(id).get();
        alumnoActual.setNombre(alumno.getNombre());
        alumnoActual.setApellido(alumno.getApellido());
        alumnoActual.setEdad(alumno.getEdad());
        return repositorio.save(alumnoActual);
    }


    @DeleteMapping("/{id}")
    public String deleteAlumno(@PathVariable Long id){
        try {
            repositorio.findById(id).get();
            repositorio.deleteById(id);
            return "Alumno eliminado";
        } catch (Exception e) {
            return "No se pudo eliminar el alumno";
        }
    }

}
