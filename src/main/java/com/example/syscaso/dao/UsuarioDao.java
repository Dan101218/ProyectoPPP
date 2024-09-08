package com.example.syscaso.dao;

import java.util.List;

import com.example.syscaso.entity.Usuario;


public interface UsuarioDao {
    Usuario create(Usuario u);
    Usuario update(Usuario u);
    void delete(Long id);
    Usuario read(Long id);
    List<Usuario> readAll();
    Usuario registrarUsuarioRol(Long usuarioId, Long rolId);
}
