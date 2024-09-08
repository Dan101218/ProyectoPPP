package com.example.syscaso.dao;

import java.util.List;

import com.example.syscaso.entity.Pelicula;


public interface PeliculaDao {
    Pelicula create(Pelicula p);
    Pelicula update(Pelicula p);
    void delete(Long id);
    Pelicula read(Long id);
    List<Pelicula> readAll();
}
