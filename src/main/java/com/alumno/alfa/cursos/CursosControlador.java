package com.alumno.alfa.cursos;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("/curso")
@CrossOrigin(origins = "*")
public class CursosControlador {
    @Autowired
    private CursosRepositorio repositorio;
    
    @GetMapping
    public List<curso> getCursos(){
        return repositorio.findAll();
    }

    //
    @GetMapping("/{id}")
    public curso getcursoById(@PathVariable Long id){
        return repositorio.findById(id).get();
    }

    @PostMapping
    public curso createCurso(@RequestBody curso curso){
        return repositorio.save(curso);
    }
    
    @PutMapping("/{id}")
    public curso updatecurso(@PathVariable Long id, @RequestBody curso curso){
        curso cursoActual = repositorio.findById(id).get();
        cursoActual.setCursonombre(curso.getCursonombre());
        cursoActual.setProfesor(curso.getProfesor());
        cursoActual.setSalon(curso.getSalon());

        
        return repositorio.save(cursoActual);
    }


    @DeleteMapping("/{id}")
    public String deletecurso(@PathVariable Long id){
        try {
            repositorio.findById(id).get();
            repositorio.deleteById(id);
            return "curso eliminado";
        } catch (Exception e) {
            return "No se pudo eliminar el curso";
        }
    }

}
