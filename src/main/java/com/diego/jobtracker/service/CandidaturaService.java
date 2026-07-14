package com.diego.jobtracker.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.diego.jobtracker.entity.Candidatura;
import com.diego.jobtracker.repository.CandidaturaRepository;

@Service
public class CandidaturaService {

    private final CandidaturaRepository repository;

    public CandidaturaService(CandidaturaRepository repository) {
        this.repository = repository;
    }

    public List<Candidatura> obtenerTodas() {
        return repository.findAll();
    }
}