package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Sede;

public interface SedeDao {
	Sede create(Sede c);
	Sede update(Sede c);
	void delete(Long id);
	Optional<Sede> read(Long id);
	List<Sede> readAll();
}
