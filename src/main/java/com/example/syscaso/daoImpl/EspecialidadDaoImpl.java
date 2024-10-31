package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.EspecialidadDao;
import com.example.syscaso.entity.Especialidad;
import com.example.syscaso.repository.EspecialidadRepository;

@Component
public class EspecialidadDaoImpl implements EspecialidadDao {

	@Autowired
	private EspecialidadRepository repository;
	
	@Override
	public Especialidad create(Especialidad c) {
        return repository.save(c);
		
	}

	@Override
	public Especialidad update(Especialidad c) {
		return repository.save(c);
		
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);
		
	}

	@Override
	public Optional<Especialidad> read(Long id) {
        return repository.findById(id); 

	}

	@Override
	public List<Especialidad> readAll() {
		return repository.findAll();
	}
}
