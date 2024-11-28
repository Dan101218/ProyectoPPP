package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.SedeDao;
import com.example.syscaso.entity.Sede;
import com.example.syscaso.service.SedeService;

@Service
public class SedeServiceImpl implements SedeService {

    @Autowired
    private SedeDao dao;

    @Override
    public Sede create(Sede c) {
        return dao.create(c);
    }

    @Override
    public Sede update(Sede c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Sede> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Sede> readAll() {
        return dao.readAll();
    }
}
