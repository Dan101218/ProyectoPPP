package com.example.syscaso.dao;

import java.util.List;

import com.example.syscaso.entity.Renta;


public interface RentaDao {
    Renta create(Renta r);
    Renta update(Renta r);
    void delete(Long id);
    Renta read(Long id);
    List<Renta> readAll();
}

