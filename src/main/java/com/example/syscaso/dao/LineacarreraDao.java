package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Lineacarrera;

public interface LineacarreraDao {
	Lineacarrera create(Lineacarrera c);
	Lineacarrera update(Lineacarrera c);
	void delete(Long id);
	Optional<Lineacarrera> read(Long id);
	List<Lineacarrera> readAll();
}
