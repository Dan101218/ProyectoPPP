package com.example.syscaso.dao;

import java.util.List;

import com.example.syscaso.entity.Empleado;


public interface EmpleadoDao {
    Empleado create(Empleado e);
    Empleado update(Empleado e);
    void delete(Long id);
    Empleado read(Long id);
    List<Empleado> readAll();
}
