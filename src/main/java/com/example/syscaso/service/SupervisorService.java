package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Supervisor;

public interface SupervisorService {
    Supervisor create(Supervisor s);
    Supervisor update(Supervisor s);
    void delete(Long id);
    Optional<Supervisor> read(Long id);
    List<Supervisor> readAll();
}
