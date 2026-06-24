package com.diego.jobtracker.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import com.diego.jobtracker.enums.EstadoCandidatura;

import java.time.LocalDate;

// Esta entidad representa una candidatura a un puesto de trabajo en el sistema de seguimiento de candidaturas.
// PostgreSQL utiliza esta clase para mapear  la tabla
@Entity
public class Candidatura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String empresa;

    private String puesto;

    private LocalDate fechaCandidatura;

    private String notas;

    @Enumerated(EnumType.STRING)
    private EstadoCandidatura estado;
}
