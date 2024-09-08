package com.example.syscaso.dao;

import java.util.List;

import com.example.syscaso.entity.Acceso;


public interface AccesoDao {
    Acceso create(Acceso a);
    Acceso update(Acceso a);
    void delete(Long id);
    Acceso read(Long id);
    List<Acceso> readAll();
    Acceso registrarAccesoRol(Long accesoId, Long rolId);
    
}
