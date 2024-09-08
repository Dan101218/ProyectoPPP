package com.example.syscaso.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.syscaso.entity.Pelicula;
@Repository
public interface PeliculaRepository extends JpaRepository<Pelicula, Long>{

}