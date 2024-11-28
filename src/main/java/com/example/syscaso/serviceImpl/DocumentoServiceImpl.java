package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.DocumentoDao;
import com.example.syscaso.entity.Documento;
import com.example.syscaso.service.DocumentoService;

@Service
public class DocumentoServiceImpl implements DocumentoService {

    @Autowired
    private DocumentoDao dao;

    @Override
    public Documento create(Documento c) {
        return dao.create(c);
    }

    @Override
    public Documento update(Documento c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Documento> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Documento> readAll() {
        return dao.readAll();
    }
}
