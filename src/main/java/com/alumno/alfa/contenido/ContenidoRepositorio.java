package com.alumno.alfa.contenido;

import org.springframework.stereotype.Repository;
import com.alumno.alfa.contenido.*; //Cambia por el paquete donde se encuentra la clase Contenido
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface ContenidoRepositorio extends JpaRepository<Contenido, Long> {
    
}
