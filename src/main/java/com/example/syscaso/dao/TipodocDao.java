package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Tipodoc;

public interface TipodocDao {
	Tipodoc create(Tipodoc c);
	Tipodoc update(Tipodoc c);
	void delete(Long id);
	Optional<Tipodoc> read(Long id);
	List<Tipodoc> readAll();
}
