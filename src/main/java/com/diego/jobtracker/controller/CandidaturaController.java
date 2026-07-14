package com.diego.jobtracker.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.diego.jobtracker.entity.Candidatura;
import com.diego.jobtracker.service.CandidaturaService;

@RestController
@RequestMapping("/api/candidaturas")
public class CandidaturaController {

    private final CandidaturaService service;

    public CandidaturaController(CandidaturaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Candidatura> obtenerTodas() {
        return service.obtenerTodas();
    }
}