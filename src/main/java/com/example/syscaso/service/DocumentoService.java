package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Documento;

public interface DocumentoService {
    Documento create(Documento d);
    Documento update(Documento d);
    void delete(Long id);
    Optional<Documento> read(Long id);
    List<Documento> readAll();
}
