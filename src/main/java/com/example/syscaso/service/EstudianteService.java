package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Estudiante;

public interface EstudianteService {
    Estudiante create(Estudiante e);
    Estudiante update(Estudiante e);
    void delete(Long id);
    Optional<Estudiante> read(Long id);
    List<Estudiante> readAll();
}
