package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.LineacarreraDao;
import com.example.syscaso.entity.Lineacarrera;
import com.example.syscaso.service.LineacarreraService;

@Service
public class LineacarreraServiceImpl implements LineacarreraService {

    @Autowired
    private LineacarreraDao dao;

    @Override
    public Lineacarrera create(Lineacarrera c) {
        return dao.create(c);
    }

    @Override
    public Lineacarrera update(Lineacarrera c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Lineacarrera> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Lineacarrera> readAll() {
        return dao.readAll();
    }
}
