package com.sistemaAcademico.singleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaAcademico.singleton.service.EstadisticasService;

@RestController
@RequestMapping("/aprendices")
public class AprendizController {

    private final EstadisticasService estadisticas;

    public AprendizController(EstadisticasService estadisticas){
        this.estadisticas = estadisticas;
    }

    @GetMapping
    public String aprendiz(){
      estadisticas.incrementarAprendices();

        return "Consulta de aprendiz realizada";
    }
    
}
