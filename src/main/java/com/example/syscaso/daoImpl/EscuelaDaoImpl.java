package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.EscuelaDao;
import com.example.syscaso.entity.Escuela;
import com.example.syscaso.repository.EscuelaRepository;

@Component
public class EscuelaDaoImpl implements EscuelaDao {

	@Autowired
	private EscuelaRepository repository;
	
	@Override
	public Escuela create(Escuela c) {
        return repository.save(c);
		
	}

	@Override
	public Escuela update(Escuela c) {
		return repository.save(c);
		
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);
		
	}

	@Override
	public Optional<Escuela> read(Long id) {
        return repository.findById(id); 

	}

	@Override
	public List<Escuela> readAll() {
		return repository.findAll();
	}
}
