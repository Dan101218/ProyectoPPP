package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Evaluacion;

public interface EvaluacionDao {
	Evaluacion create(Evaluacion c);
	Evaluacion update(Evaluacion c);
	void delete(Long id);
	Optional<Evaluacion> read(Long id);
	List<Evaluacion> readAll();
}
