package com.example.syscaso.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.AccesoDao;
import com.example.syscaso.entity.Acceso;
import com.example.syscaso.service.AccesoService;

import jakarta.transaction.Transactional;


@Service
public class AccesoServiceImpl implements AccesoService{
    @Autowired
    private AccesoDao accesoDao;
	@Override
	public Acceso create(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.create(a);
	}

	@Override
	public Acceso update(Acceso a) {
		// TODO Auto-generated method stub
		return accesoDao.update(a);
	}

	@Override
	public void delete(Long id) {
		accesoDao.delete(id);
		
	}

	@Override
	public Acceso read(Long id) {
		// TODO Auto-generated method stub
		return accesoDao.read(id);
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoDao.readAll();
	}
	@Override
	@Transactional
	public Acceso createAccesoRol(Long accesoId, Long rolId) {
		// TODO Auto-generated method stub
		return accesoDao.registrarAccesoRol(accesoId, rolId);
	}
}