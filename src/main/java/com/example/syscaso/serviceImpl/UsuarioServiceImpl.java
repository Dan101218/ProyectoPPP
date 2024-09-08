package com.example.syscaso.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.UsuarioDao;
import com.example.syscaso.entity.Usuario;
import com.example.syscaso.service.UsuarioService;

import jakarta.transaction.Transactional;


@Service
public class UsuarioServiceImpl implements UsuarioService{
    @Autowired
    private UsuarioDao usuarioDao;
	@Override
	public Usuario create(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.create(u);
	}

	@Override
	public Usuario update(Usuario u) {
		// TODO Auto-generated method stub
		return usuarioDao.update(u);
	}

	@Override	
	public void delete(Long id) {
		usuarioDao.delete(id);
		
	}

	@Override
	public Usuario read(Long id) {
		// TODO Auto-generated method stub
		return usuarioDao.read(id);
	}

	@Override
	public List<Usuario> readAll() {
		// TODO Auto-generated method stub
		return usuarioDao.readAll();
	}
	@Override
	@Transactional
	public Usuario createUsuarioRol(Long usuarioId, Long rolId) {
		// TODO Auto-generated method stub
		return usuarioDao.registrarUsuarioRol(usuarioId, rolId);
	}
}