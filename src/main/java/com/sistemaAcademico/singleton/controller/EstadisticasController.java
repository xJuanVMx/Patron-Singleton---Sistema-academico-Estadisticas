package com.sistemaAcademico.singleton.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaAcademico.singleton.service.EstadisticasService;

@RestController
@RequestMapping("/estadisticas")
public class EstadisticasController {
    private final EstadisticasService estadisticas;

    public EstadisticasController(EstadisticasService estadisticas){
        this.estadisticas = estadisticas;
    }

    @GetMapping
    public String estadisticas(){

        return estadisticas.obtenerEstadisticas();
    }
    
}
