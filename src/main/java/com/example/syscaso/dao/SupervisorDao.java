package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Supervisor;

public interface SupervisorDao {
	Supervisor create(Supervisor c);
	Supervisor update(Supervisor c);
	void delete(Long id);
	Optional<Supervisor> read(Long id);
	List<Supervisor> readAll();
}
