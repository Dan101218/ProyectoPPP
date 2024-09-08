package com.example.syscaso.dao;

import java.util.List;

import com.example.syscaso.entity.Cliente;


public interface ClienteDao {
    Cliente create(Cliente c);
    Cliente update(Cliente c);
    void delete(Long id);
    Cliente read(Long id);
    List<Cliente> readAll();
}
