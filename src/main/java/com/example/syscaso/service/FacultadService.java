package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Facultad;

public interface FacultadService {
    Facultad create(Facultad f);
    Facultad update(Facultad f);
    void delete(Long id);
    Optional<Facultad> read(Long id);
    List<Facultad> readAll();
}

