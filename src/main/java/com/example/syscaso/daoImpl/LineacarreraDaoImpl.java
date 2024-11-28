package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.LineacarreraDao;
import com.example.syscaso.entity.Lineacarrera;
import com.example.syscaso.repository.LineacarreraRepository;

@Component
public class LineacarreraDaoImpl implements LineacarreraDao {

    @Autowired
    private LineacarreraRepository repository;

    @Override
    public Lineacarrera create(Lineacarrera c) {
        return repository.save(c);
    }

    @Override
    public Lineacarrera update(Lineacarrera c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Lineacarrera> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Lineacarrera> readAll() {
        return repository.findAll();
    }
}
