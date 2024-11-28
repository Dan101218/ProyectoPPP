package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.EvaluacionDao;
import com.example.syscaso.entity.Evaluacion;
import com.example.syscaso.repository.EvaluacionRepository;

@Component
public class EvaluacionDaoImpl implements EvaluacionDao {

    @Autowired
    private EvaluacionRepository repository;

    @Override
    public Evaluacion create(Evaluacion c) {
        return repository.save(c);
    }

    @Override
    public Evaluacion update(Evaluacion c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Evaluacion> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Evaluacion> readAll() {
        return repository.findAll();
    }
}
