package com.example.syscaso.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.EmpleadoDao;
import com.example.syscaso.entity.Empleado;
import com.example.syscaso.service.EmpleadoService;


@Service
public class EmpleadoServiceImpl implements EmpleadoService{
    @Autowired
    private EmpleadoDao empleadoDao;
	@Override
	public Empleado create(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.create(e);
	}

	@Override
	public Empleado update(Empleado e) {
		// TODO Auto-generated method stub
		return empleadoDao.update(e);
	}

	@Override
	public void delete(Long id) {
		empleadoDao.delete(id);
		
	}

	@Override
	public Empleado read(Long id) {
		// TODO Auto-generated method stub
		return empleadoDao.read(id);
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoDao.readAll();
	}

}