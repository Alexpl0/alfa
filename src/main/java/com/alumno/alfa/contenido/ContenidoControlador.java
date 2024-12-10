package com.alumno.alfa.contenido;
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
@RequestMapping("/contenido")
@CrossOrigin(origins = "*")

public class ContenidoControlador {
    @Autowired
    private ContenidoRepositorio repositorio;
    
    @GetMapping
    public List<Contenido> getContenido(){
        return repositorio.findAll();
    }

    //
    @GetMapping("/{id}")
    public Contenido getContenidoById(@PathVariable Long id){
        return repositorio.findById(id).get();
    }

    @PostMapping
    public Contenido createContenido(@RequestBody Contenido Contenido){
        return repositorio.save(Contenido);
    }
    
    @PutMapping("/{id}")
    public Contenido updateContenido(@PathVariable Long id, @RequestBody Contenido Contenido){
        Contenido ContenidoActual = repositorio.findById(id).get();
        ContenidoActual.setTitulo(Contenido.getTitulo());
        ContenidoActual.setFuente(Contenido.getFuente());
        ContenidoActual.setUrl(Contenido.getUrl());

        
        return repositorio.save(ContenidoActual);
    }


    @DeleteMapping("/{id}")
    public String deleteContenido(@PathVariable Long id){
        try {
            repositorio.findById(id).get();
            repositorio.deleteById(id);
            return "Contenido eliminado";
        } catch (Exception e) {
            return "No se pudo eliminar el Contenido";
        }
    }

}
