package com.alumno.alfa.cursos;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CursosRepositorio extends JpaRepository<curso, Long> {


}
