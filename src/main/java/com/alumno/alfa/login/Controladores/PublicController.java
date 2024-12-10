package com.alumno.alfa.login.Controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping ("/public")
@RequiredArgsConstructor
public class PublicController {
    
    @GetMapping ("/home")
    public String home() {
        return "Public home";
    }
}
