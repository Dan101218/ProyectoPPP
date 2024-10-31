package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.EspecialidadDao;
import com.example.syscaso.entity.Especialidad;
import com.example.syscaso.service.EspecialidadService;




@Service
public class EspecialidadServiceImpl implements EspecialidadService {
	
	@Autowired
	private EspecialidadDao dao;

	@Override
	public Especialidad create(Especialidad c) {
		// TODO Auto-generated method stub
		return dao.create(c);
	}

	@Override
	public Especialidad update(Especialidad c) {
		// TODO Auto-generated method stub
		return dao.update(c);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

	@Override
	public Optional<Especialidad> read(Long id) {
		// TODO Auto-generated method stub
		return dao.read(id);
	}

	@Override
	public List<Especialidad> readAll() {
		// TODO Auto-generated method stub
		return dao.readAll();
	}

}
