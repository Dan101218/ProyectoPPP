package com.example.syscaso.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.example.syscaso.dao.AccesoDao;
import com.example.syscaso.entity.Acceso;
import com.example.syscaso.entity.Rol;
import com.example.syscaso.repository.AccesoRepository;
import com.example.syscaso.repository.RolRepository;
@Component
public class AccesoDaoImpl  implements AccesoDao{
    @Autowired
    private AccesoRepository accesoRepository;
    
    @Autowired
	private RolRepository repository1;
	@Override
	public Acceso create(Acceso r) {
		// TODO Auto-generated method stub
		return accesoRepository.save(r);
	}

	@Override
	public Acceso update(Acceso r) {
		// TODO Auto-generated method stub
		return accesoRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		accesoRepository.deleteById(id);
	}

	@Override
	public Acceso read(Long id) {
		// TODO Auto-generated method stub
		return accesoRepository.findById(id).get();
	}

	@Override
	public List<Acceso> readAll() {
		// TODO Auto-generated method stub
		return accesoRepository.findAll();
	}
	@Override
	public Acceso registrarAccesoRol(Long accesoId, Long rolId) {
		// TODO Auto-generated method stub
		Acceso ac = accesoRepository.findById(accesoId).get();
		Rol rol = repository1.findById(rolId).get();
		
		ac.getRoles().add(rol);
		rol.getAccesos().add(ac);
		
		return accesoRepository.save(ac);
	}


}
