package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Sede;

public interface SedeService {
    Sede create(Sede s);
    Sede update(Sede s);
    void delete(Long id);
    Optional<Sede> read(Long id);
    List<Sede> readAll();
}
