package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.SupervisorDao;
import com.example.syscaso.entity.Supervisor;
import com.example.syscaso.repository.SupervisorRepository;

@Component
public class SupervisorDaoImpl implements SupervisorDao {

    @Autowired
    private SupervisorRepository repository;

    @Override
    public Supervisor create(Supervisor c) {
        return repository.save(c);
    }

    @Override
    public Supervisor update(Supervisor c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Supervisor> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Supervisor> readAll() {
        return repository.findAll();
    }
}
