package com.example.syscaso.service;

import java.util.List;

import com.example.syscaso.entity.Usuario;


public interface UsuarioService {
    Usuario create(Usuario u);
    Usuario update(Usuario u);
    void delete(Long id);
    Usuario read(Long id);
    List<Usuario> readAll();
    Usuario createUsuarioRol(Long usuarioId, Long rolId);
}