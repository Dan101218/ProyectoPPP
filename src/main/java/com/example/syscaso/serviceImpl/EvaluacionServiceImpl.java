package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.EvaluacionDao;
import com.example.syscaso.entity.Evaluacion;
import com.example.syscaso.service.EvaluacionService;

@Service
public class EvaluacionServiceImpl implements EvaluacionService {

    @Autowired
    private EvaluacionDao dao;

    @Override
    public Evaluacion create(Evaluacion c) {
        return dao.create(c);
    }

    @Override
    public Evaluacion update(Evaluacion c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Evaluacion> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Evaluacion> readAll() {
        return dao.readAll();
    }
}
