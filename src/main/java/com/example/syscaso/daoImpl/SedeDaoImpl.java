package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.SedeDao;
import com.example.syscaso.entity.Sede;
import com.example.syscaso.repository.SedeRepository;

@Component
public class SedeDaoImpl implements SedeDao {

    @Autowired
    private SedeRepository repository;

    @Override
    public Sede create(Sede c) {
        return repository.save(c);
    }

    @Override
    public Sede update(Sede c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Sede> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Sede> readAll() {
        return repository.findAll();
    }
}
