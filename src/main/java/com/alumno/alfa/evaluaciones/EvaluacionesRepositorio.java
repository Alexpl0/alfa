package com.alumno.alfa.evaluaciones;
import org.springframework.stereotype.Repository;
import com.alumno.alfa.evaluaciones.*; //Cambia por el paquete donde se encuentra la clase Contenido
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface EvaluacionesRepositorio extends JpaRepository<Evaluaciones, Long> {
    
}
