package com.example.syscaso.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.example.syscaso.dao.EmpleadoDao;
import com.example.syscaso.entity.Empleado;
import com.example.syscaso.repository.EmpleadoRepository;
@Component
public class EmpleadoDaoImpl  implements EmpleadoDao{
    @Autowired
    private EmpleadoRepository empleadoRepository;
	@Override
	public Empleado create(Empleado r) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(r);
	}

	@Override
	public Empleado update(Empleado r) {
		// TODO Auto-generated method stub
		return empleadoRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		empleadoRepository.deleteById(id);
	}

	@Override
	public Empleado read(Long id) {
		// TODO Auto-generated method stub
		return empleadoRepository.findById(id).get();
	}

	@Override
	public List<Empleado> readAll() {
		// TODO Auto-generated method stub
		return empleadoRepository.findAll();
	}

}
