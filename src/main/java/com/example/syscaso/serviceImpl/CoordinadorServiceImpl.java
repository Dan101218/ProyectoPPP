package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.CoordinadorDao;
import com.example.syscaso.entity.Coordinador;
import com.example.syscaso.service.CoordinadorService;

@Service
public class CoordinadorServiceImpl implements CoordinadorService {

    @Autowired
    private CoordinadorDao dao;

    @Override
    public Coordinador create(Coordinador c) {
        return dao.create(c);
    }

    @Override
    public Coordinador update(Coordinador c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Coordinador> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Coordinador> readAll() {
        return dao.readAll();
    }
}
