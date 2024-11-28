package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.SupervisorDao;
import com.example.syscaso.entity.Supervisor;
import com.example.syscaso.service.SupervisorService;

@Service
public class SupervisorServiceImpl implements SupervisorService {

    @Autowired
    private SupervisorDao dao;

    @Override
    public Supervisor create(Supervisor c) {
        return dao.create(c);
    }

    @Override
    public Supervisor update(Supervisor c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Supervisor> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Supervisor> readAll() {
        return dao.readAll();
    }
}
