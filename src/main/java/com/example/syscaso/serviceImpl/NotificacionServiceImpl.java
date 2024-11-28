package com.example.syscaso.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.NotificacionDao;
import com.example.syscaso.entity.Notificacion;
import com.example.syscaso.service.NotificacionService;

@Service
public class NotificacionServiceImpl implements NotificacionService {

    @Autowired
    private NotificacionDao dao;

    @Override
    public Notificacion create(Notificacion c) {
        return dao.create(c);
    }

    @Override
    public Notificacion update(Notificacion c) {
        return dao.update(c);
    }

    @Override
    public void delete(Long id) {
        dao.delete(id);
    }

    @Override
    public Optional<Notificacion> read(Long id) {
        return dao.read(id);
    }

    @Override
    public List<Notificacion> readAll() {
        return dao.readAll();
    }
}
