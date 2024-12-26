package com.promedionotas.promedionotas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlumnoController {
    
    @GetMapping("/promedio")
    public double promediar(@RequestParam double nota1, @RequestParam double nota2, @RequestParam double nota3){
        double promedio = (nota1 + nota2 + nota3)/3;
        return promedio;
    }
}
