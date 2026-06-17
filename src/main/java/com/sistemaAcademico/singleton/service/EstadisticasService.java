package com.sistemaAcademico.singleton.service;

import org.springframework.stereotype.Service;

@Service
public class EstadisticasService {

    private int consultasAprendices;
    private int consultasInstructores;
    private int consultasProgramas;

    public void incrementarAprendices() {
        consultasAprendices++;
    }

    public void incrementarInstructores() {
        consultasInstructores++;
    }

    public void incrementarProgramas() {
        consultasProgramas++;
    }

    public String obtenerEstadisticas() {
        return "Aprendices: " + consultasAprendices +
                ", Instructores: " + consultasInstructores +
                ", Programas: " + consultasProgramas;
    }
}