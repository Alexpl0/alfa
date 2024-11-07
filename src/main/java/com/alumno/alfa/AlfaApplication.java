package com.alumno.alfa;

//netstat -ano | findstr :8080

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AlfaApplication {

	public static void main(String[] args) {
		System.out.println("Hola mundo");
		SpringApplication.run(AlfaApplication.class, args);
	}

}
