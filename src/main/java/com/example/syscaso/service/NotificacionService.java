package com.example.syscaso.service;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Notificacion;

public interface NotificacionService {
    Notificacion create(Notificacion n);
    Notificacion update(Notificacion n);
    void delete(Long id);
    Optional<Notificacion> read(Long id);
    List<Notificacion> readAll();
}
