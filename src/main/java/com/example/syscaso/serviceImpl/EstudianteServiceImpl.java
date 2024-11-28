package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.EstudianteDao;
import com.example.syscaso.entity.Estudiante;
import com.example.syscaso.service.EstudianteService;

@Service
public class EstudianteServiceImpl implements EstudianteService {

    @Autowired
    private EstudianteDao dao;

    @Override
    public Estudiante create(Estudiante c) {
        return dao.create(c);
    }

    @Override
    public Estudiante update(Estudiante c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Estudiante> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Estudiante> readAll() {
        return dao.readAll();
    }
}
