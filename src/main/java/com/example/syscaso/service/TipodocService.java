package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Tipodoc;

public interface TipodocService {
    Tipodoc create(Tipodoc t);
    Tipodoc update(Tipodoc t);
    void delete(Long id);
    Optional<Tipodoc> read(Long id);
    List<Tipodoc> readAll();
}
