package com.example.syscaso.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.example.syscaso.dao.RolDao;
import com.example.syscaso.entity.Rol;
import com.example.syscaso.repository.RolRepository;
@Component
public class RolDaoImpl  implements RolDao{
    @Autowired
    private RolRepository rolRepository;
	@Override
	public Rol create(Rol r) {
		// TODO Auto-generated method stub
		return rolRepository.save(r);
	}

	@Override
	public Rol update(Rol r) {
		// TODO Auto-generated method stub
		return rolRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		rolRepository.deleteById(id);
	}

	@Override
	public Rol read(Long id) {
		// TODO Auto-generated method stub
		return rolRepository.findById(id).get();
	}

	@Override
	public List<Rol> readAll() {
		// TODO Auto-generated method stub
		return rolRepository.findAll();
	}

}

