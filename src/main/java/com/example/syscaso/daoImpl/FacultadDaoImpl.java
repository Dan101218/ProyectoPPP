package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.FacultadDao;
import com.example.syscaso.entity.Facultad;
import com.example.syscaso.repository.FacultadRepository;

@Component
public class FacultadDaoImpl implements FacultadDao {

    @Autowired
    private FacultadRepository repository;

    @Override
    public Facultad create(Facultad c) {
        return repository.save(c);
    }

    @Override
    public Facultad update(Facultad c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Facultad> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Facultad> readAll() {
        return repository.findAll();
    }
}
