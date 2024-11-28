package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.EmpresaDao;
import com.example.syscaso.entity.Empresa;
import com.example.syscaso.repository.EmpresaRepository;

@Component
public class EmpresaDaoImpl implements EmpresaDao {

    @Autowired
    private EmpresaRepository repository;

    @Override
    public Empresa create(Empresa c) {
        return repository.save(c);
    }

    @Override
    public Empresa update(Empresa c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Empresa> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Empresa> readAll() {
        return repository.findAll();
    }
}
