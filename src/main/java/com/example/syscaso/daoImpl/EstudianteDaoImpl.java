package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.EstudianteDao;
import com.example.syscaso.entity.Estudiante;
import com.example.syscaso.repository.EstudianteRepository;

@Component
public class EstudianteDaoImpl implements EstudianteDao {

    @Autowired
    private EstudianteRepository repository;

    @Override
    public Estudiante create(Estudiante c) {
        return repository.save(c);
    }

    @Override
    public Estudiante update(Estudiante c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Estudiante> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Estudiante> readAll() {
        return repository.findAll();
    }
}
