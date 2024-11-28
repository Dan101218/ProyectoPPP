package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Lineacarrera;

public interface LineacarreraService {
    Lineacarrera create(Lineacarrera l);
    Lineacarrera update(Lineacarrera l);
    void delete(Long id);
    Optional<Lineacarrera> read(Long id);
    List<Lineacarrera> readAll();
}
