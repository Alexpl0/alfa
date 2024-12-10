package com.alumno.alfa.evaluaciones;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "evaluaciones")
@Getter
@Setter
public class Evaluaciones {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "trabajotipo")
    private String trabajotipo;

    @Column(name = "calificacion")
    private int calificacion;

    @Column(name = "comentarios")
    private String comentarios;
}
