package com.example.syscaso.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.GeneroDao;
import com.example.syscaso.entity.Genero;
import com.example.syscaso.service.GeneroService;


@Service
public class GeneroServiceImpl implements GeneroService{
    @Autowired
    private GeneroDao generoDao;
	@Override
	public Genero create(Genero g) {
		// TODO Auto-generated method stub
		return generoDao.create(g);
	}

	@Override
	public Genero update(Genero g) {
		// TODO Auto-generated method stub
		return generoDao.update(g);
	}

	@Override
	public void delete(Long id) {
		generoDao.delete(id);
		
	}

	@Override
	public Genero read(Long id) {
		// TODO Auto-generated method stub
		return generoDao.read(id);
	}

	@Override
	public List<Genero> readAll() {
		// TODO Auto-generated method stub
		return generoDao.readAll();
	}

}