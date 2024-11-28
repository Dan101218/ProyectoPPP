package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.TipodocDao;
import com.example.syscaso.entity.Tipodoc;
import com.example.syscaso.service.TipodocService;

@Service
public class TipodocServiceImpl implements TipodocService {

    @Autowired
    private TipodocDao dao;

    @Override
    public Tipodoc create(Tipodoc c) {
        return dao.create(c);
    }

    @Override
    public Tipodoc update(Tipodoc c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Tipodoc> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Tipodoc> readAll() {
        return dao.readAll();
    }
}
