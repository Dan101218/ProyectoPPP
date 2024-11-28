package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Empresa;

public interface EmpresaService {
    Empresa create(Empresa e);
    Empresa update(Empresa e);
    void delete(Long id);
    Optional<Empresa> read(Long id);
    List<Empresa> readAll();
}
