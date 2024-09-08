package com.example.syscaso.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.example.syscaso.dao.GeneroDao;
import com.example.syscaso.entity.Genero;
import com.example.syscaso.repository.GeneroRepository;
@Component
public class GeneroDaoImpl  implements GeneroDao{
    @Autowired
    private GeneroRepository generoRepository;
	@Override
	public Genero create(Genero g) {
		// TODO Auto-generated method stub
		return generoRepository.save(g);
	}

	@Override
	public Genero update(Genero g) {
		// TODO Auto-generated method stub
		return generoRepository.save(g);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		generoRepository.deleteById(id);
	}

	@Override
	public Genero read(Long id) {
		// TODO Auto-generated method stub
		return generoRepository.findById(id).get();
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return generoRepository.findAll();
	}

}