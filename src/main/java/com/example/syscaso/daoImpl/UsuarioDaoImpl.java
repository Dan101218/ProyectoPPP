package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.example.syscaso.dao.UsuarioDao;
import com.example.syscaso.entity.Rol;
import com.example.syscaso.entity.Usuario;
import com.example.syscaso.repository.RolRepository;
import com.example.syscaso.repository.UsuarioRepository;
@Component
public class UsuarioDaoImpl  implements UsuarioDao{
    @Autowired
    private UsuarioRepository usuarioRepository;
    @Autowired
    private RolRepository rolRepository;
	@Override
	public Usuario create(Usuario r) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(r);
	}

	@Override
	public Usuario update(Usuario r) {
		// TODO Auto-generated method stub
		return usuarioRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		usuarioRepository.deleteById(id);
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return usuarioRepository.findById(id).get();
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioRepository.findAll();
	}
	
@Override
	public Usuario registrarUsuarioRol(Long usuarioId, Long rolId) {
		// TODO Auto-generated method stub
	  Usuario us = usuarioRepository.findById(usuarioId)
		        .orElseThrow(() -> new NoSuchElementException("Usuario no encontrado con id: " + usuarioId));

		    Rol rol = rolRepository.findById(rolId)
		        .orElseThrow(() -> new NoSuchElementException("Rol no encontrado con id: " + rolId));

		
		us.getRoles().add(rol);
		rol.getUsuarios().add(us);
		
		return usuarioRepository.save(us);
	}
	

}
