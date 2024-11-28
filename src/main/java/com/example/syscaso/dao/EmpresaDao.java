package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Empresa;

public interface EmpresaDao {
	Empresa create(Empresa c);
	Empresa update(Empresa c);
	void delete(Long id);
	Optional<Empresa> read(Long id);
	List<Empresa> readAll();
}
