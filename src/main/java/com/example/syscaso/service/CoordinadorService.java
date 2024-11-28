package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Coordinador;

public interface CoordinadorService {
    Coordinador create(Coordinador c);
    Coordinador update(Coordinador c);
    void delete(Long id);
    Optional<Coordinador> read(Long id);
    List<Coordinador> readAll();
}
