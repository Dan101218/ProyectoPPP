package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.CoordinadorDao;
import com.example.syscaso.entity.Coordinador;
import com.example.syscaso.repository.CoordinadorRepository;

@Component
public class CoordinadorDaoImpl implements CoordinadorDao {

    @Autowired
    private CoordinadorRepository repository;

    @Override
    public Coordinador create(Coordinador c) {
        return repository.save(c);
    }

    @Override
    public Coordinador update(Coordinador c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Coordinador> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Coordinador> readAll() {
        return repository.findAll();
    }
}
