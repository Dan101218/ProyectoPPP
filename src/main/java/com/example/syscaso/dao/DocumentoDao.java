package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Documento;

public interface DocumentoDao {
	Documento create(Documento c);
	Documento update(Documento c);
	void delete(Long id);
	Optional<Documento> read(Long id);
	List<Documento> readAll();
}
