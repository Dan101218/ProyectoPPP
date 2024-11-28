package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Facultad;

public interface FacultadDao {
	Facultad create(Facultad c);
	Facultad update(Facultad c);
	void delete(Long id);
	Optional<Facultad> read(Long id);
	List<Facultad> readAll();
}
