package com.example.syscaso.dao;

import java.util.List;
import java.util.Optional;

import com.example.syscaso.entity.Notificacion;

public interface NotificacionDao {
	Notificacion create(Notificacion c);
	Notificacion update(Notificacion c);
	void delete(Long id);
	Optional<Notificacion> read(Long id);
	List<Notificacion> readAll();
}
