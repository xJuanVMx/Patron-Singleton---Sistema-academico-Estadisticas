package com.sistemaAcademico.singleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaAcademico.singleton.service.EstadisticasService;

@RestController
@RequestMapping("/programas")
public class ProgramaController {
  
    private final EstadisticasService estadisticas;

    public ProgramaController(EstadisticasService estadisticas){
        this.estadisticas = estadisticas;
    }

    @GetMapping
    public String programa(){
        estadisticas.incrementarProgramas();

        return "Consulta de programa formativo realizada";
    }
    
}
