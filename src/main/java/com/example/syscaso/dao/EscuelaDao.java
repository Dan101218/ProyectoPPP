package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Escuela;

public interface EscuelaDao {
	Escuela create(Escuela c);
	Escuela update(Escuela c);
	void delete(Long id);
	Optional<Escuela> read(Long id);
	List<Escuela> readAll();
}
