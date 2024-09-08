package com.example.syscaso.dao;

import java.util.List;

import com.example.syscaso.entity.Rol;


public interface RolDao {
    Rol create(Rol r);
    Rol update(Rol r);
    void delete(Long id);
    Rol read(Long id);
    List<Rol> readAll();
}
