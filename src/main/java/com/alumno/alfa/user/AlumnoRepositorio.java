package com.alumno.alfa.user;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface AlumnoRepositorio extends JpaRepository<Alumno, Long> {


}
