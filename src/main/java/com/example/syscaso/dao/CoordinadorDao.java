package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Coordinador;

public interface CoordinadorDao {
	Coordinador create(Coordinador c);
	Coordinador update(Coordinador c);
	void delete(Long id);
	Optional<Coordinador> read(Long id);
	List<Coordinador> readAll();
}
