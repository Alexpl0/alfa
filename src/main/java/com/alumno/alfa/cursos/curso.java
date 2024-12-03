package com.alumno.alfa.cursos;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "curso")
@Getter
@Setter
public class curso {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "cursonombre")
    private String cursonombre;

    @Column(name = "profesor")
    private String profesor;

    @Column(name = "salon")
    private int salon;
    
}
