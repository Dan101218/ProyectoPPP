package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Estudiante;

public interface EstudianteDao {
	Estudiante create(Estudiante c);
	Estudiante update(Estudiante c);
	void delete(Long id);
	Optional<Estudiante> read(Long id);
	List<Estudiante> readAll();
}
