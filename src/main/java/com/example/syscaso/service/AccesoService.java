package com.example.syscaso.service;

import java.util.List;

import com.example.syscaso.entity.Acceso;


public interface AccesoService {
    Acceso create(Acceso a);
    Acceso update(Acceso a);
    void delete(Long id);
    Acceso read(Long id);
    List<Acceso> readAll();
    Acceso createAccesoRol(Long accesoId, Long rolId);
}
