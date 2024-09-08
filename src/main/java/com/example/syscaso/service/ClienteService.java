package com.example.syscaso.service;

import java.util.List;

import com.example.syscaso.entity.Cliente;


public interface ClienteService {
    Cliente create(Cliente c);
    Cliente update(Cliente c);
    void delete(Long id);
    Cliente read(Long id);
    List<Cliente> readAll();
}
