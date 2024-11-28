package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.FacultadDao;
import com.example.syscaso.entity.Facultad;
import com.example.syscaso.service.FacultadService;

@Service
public class FacultadServiceImpl implements FacultadService {

    @Autowired
    private FacultadDao dao;

    @Override
    public Facultad create(Facultad c) {
        return dao.create(c);
    }

    @Override
    public Facultad update(Facultad c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Facultad> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Facultad> readAll() {
        return dao.readAll();
    }
}
