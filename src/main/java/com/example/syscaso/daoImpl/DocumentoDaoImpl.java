package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.DocumentoDao;
import com.example.syscaso.entity.Documento;
import com.example.syscaso.repository.DocumentoRepository;

@Component
public class DocumentoDaoImpl implements DocumentoDao {

    @Autowired
    private DocumentoRepository repository;

    @Override
    public Documento create(Documento c) {
        return repository.save(c);
    }

    @Override
    public Documento update(Documento c) {
        return repository.save(c);
    }

    @Override
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public Optional<Documento> read(Long id) {
        return repository.findById(id);
    }

    @Override
    public List<Documento> readAll() {
        return repository.findAll();
    }
}
