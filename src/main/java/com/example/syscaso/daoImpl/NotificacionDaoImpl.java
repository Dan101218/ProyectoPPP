package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.NotificacionDao;
import com.example.syscaso.entity.Notificacion;
import com.example.syscaso.repository.NotificacionRepository;

@Component
public class NotificacionDaoImpl implements NotificacionDao {

	@Autowired
	private NotificacionRepository repository;
	
	@Override
	public Notificacion create(Notificacion c) {
        return repository.save(c);
		
	}

	@Override
	public Notificacion update(Notificacion c) {
		return repository.save(c);
		
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);
		
	}

	@Override
	public Optional<Notificacion> read(Long id) {
        return repository.findById(id); 

	}

	@Override
	public List<Notificacion> readAll() {
		return repository.findAll();
	}
}
