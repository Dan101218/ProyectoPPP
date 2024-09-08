package com.example.syscaso.service;

import java.util.List;

import com.example.syscaso.entity.Genero;


public interface GeneroService {
    Genero create(Genero g);
    Genero update(Genero g);
    void delete(Long id);
    Genero read(Long id);
    List<Genero> readAll();
}