package com.alumno.alfa.evaluaciones;
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
@RequestMapping("/evaluaciones")
@CrossOrigin(origins = "*")
public class EvaluacionesControlador {
    @Autowired
    private EvaluacionesRepositorio repositorio;
    
    @GetMapping
    public List<Evaluaciones> getEvaluaciones(){
        return repositorio.findAll();
    }

    //
    @GetMapping("/{id}")
    public Evaluaciones getEvaluacionesById(@PathVariable Long id){
        return repositorio.findById(id).get();
    }

    @PostMapping
    public Evaluaciones createEvaluaciones(@RequestBody Evaluaciones Evaluaciones){
        return repositorio.save(Evaluaciones);
    }
    
    @PutMapping("/{id}")
    public Evaluaciones updateEvaluaciones(@PathVariable Long id, @RequestBody Evaluaciones Evaluaciones){
        Evaluaciones EvaluacionesActual = repositorio.findById(id).get();
        EvaluacionesActual.setTrabajotipo(Evaluaciones.getTrabajotipo());
        EvaluacionesActual.setCalificacion(Evaluaciones.getCalificacion());
        EvaluacionesActual.setComentarios(Evaluaciones.getComentarios());

        
        return repositorio.save(EvaluacionesActual);
    }


    @DeleteMapping("/{id}")
    public String deleteEvaluaciones(@PathVariable Long id){
        try {
            repositorio.findById(id).get();
            repositorio.deleteById(id);
            return "Evaluacion eliminada";
        } catch (Exception e) {
            return "No se pudo eliminar la Evaluacion";
        }
    }

}
