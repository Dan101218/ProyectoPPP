package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.PPPDao;
import com.example.syscaso.entity.PPP;
import com.example.syscaso.service.PPPService;

@Service
public class PPPServiceImpl implements PPPService {

    @Autowired
    private PPPDao dao;

    @Override
    public PPP create(PPP c) {
        return dao.create(c);
    }

    @Override
    public PPP update(PPP c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<PPP> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<PPP> readAll() {
        return dao.readAll();
    }
}
