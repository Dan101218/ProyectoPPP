package com.example.syscaso.service;

import java.util.List;

import com.example.syscaso.entity.Renta;


public interface RentaService {
    Renta create(Renta r);
    Renta update(Renta r);
    void delete(Long id);
    Renta read(Long id);
    List<Renta> readAll();
}