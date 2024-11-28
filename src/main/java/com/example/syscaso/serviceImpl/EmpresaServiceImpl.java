package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.EmpresaDao;
import com.example.syscaso.entity.Empresa;
import com.example.syscaso.service.EmpresaService;

@Service
public class EmpresaServiceImpl implements EmpresaService {

    @Autowired
    private EmpresaDao dao;

    @Override
    public Empresa create(Empresa c) {
        return dao.create(c);
    }

    @Override
    public Empresa update(Empresa c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Empresa> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Empresa> readAll() {
        return dao.readAll();
    }
}
