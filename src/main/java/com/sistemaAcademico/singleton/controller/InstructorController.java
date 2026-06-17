package com.sistemaAcademico.singleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaAcademico.singleton.service.EstadisticasService;

@RestController
@RequestMapping("/instructores")
public class InstructorController {
    private final EstadisticasService estadisticas;

    public InstructorController(EstadisticasService estadisticas){
        this.estadisticas = estadisticas;
    }

    @GetMapping
    public String instructor(){
        estadisticas.incrementarInstructores();

        return "Consulta de instructor realizada";
    }
}
