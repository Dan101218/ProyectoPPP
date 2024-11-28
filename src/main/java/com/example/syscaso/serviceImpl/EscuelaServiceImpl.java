package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.EscuelaDao;
import com.example.syscaso.entity.Escuela;
import com.example.syscaso.service.EscuelaService;

@Service
public class EscuelaServiceImpl implements EscuelaService {

    @Autowired
    private EscuelaDao dao;

    @Override
    public Escuela create(Escuela c) {
        return dao.create(c);
    }

    @Override
    public Escuela update(Escuela c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Escuela> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Escuela> readAll() {
        return dao.readAll();
    }
}
