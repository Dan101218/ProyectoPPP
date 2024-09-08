package com.example.syscaso.service;

import java.util.List;

import com.example.syscaso.entity.Pelicula;


public interface PeliculaService {
    Pelicula create(Pelicula p);
    Pelicula update(Pelicula p);
    void delete(Long id);
    Pelicula read(Long id);
    List<Pelicula> readAll();
}