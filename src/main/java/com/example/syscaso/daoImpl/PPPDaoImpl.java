package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.PPPDao;
import com.example.syscaso.entity.PPP;
import com.example.syscaso.repository.PPPRepository;

@Component
public class PPPDaoImpl implements PPPDao {

    @Autowired
    private PPPRepository repository;

    @Override
    public PPP create(PPP c) {
        return repository.save(c);
    }

    @Override
    public PPP update(PPP c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<PPP> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<PPP> readAll() {
        return repository.findAll();
    }
}
