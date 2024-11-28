package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.TipodocDao;
import com.example.syscaso.entity.Tipodoc;
import com.example.syscaso.repository.TipodocRepository;

@Component
public class TipodocDaoImpl implements TipodocDao {

    @Autowired
    private TipodocRepository repository;

    @Override
    public Tipodoc create(Tipodoc c) {
        return repository.save(c);
    }

    @Override
    public Tipodoc update(Tipodoc c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Tipodoc> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Tipodoc> readAll() {
        return repository.findAll();
    }
}
