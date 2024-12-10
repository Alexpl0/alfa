package com.alumno.alfa.contenido;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "contenido")
@Getter
@Setter
public class Contenido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "titulo")
    private String titulo;

    @Column(name = "fuente")
    private String fuente;

    @Column(name = "url")
    private String url;
    
}
