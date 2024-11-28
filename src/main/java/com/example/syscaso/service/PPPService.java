package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.PPP;

public interface PPPService {
    PPP create(PPP p);
    PPP update(PPP p);
    void delete(Long id);
    Optional<PPP> read(Long id);
    List<PPP> readAll();
}
