package com.example.syscaso.daoImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.syscaso.dao.DoctorDao;
import com.example.syscaso.entity.Doctor;
import com.example.syscaso.repository.DoctorRepository;

@Component
public class DoctorDaoImpl implements DoctorDao {

	@Autowired
	private DoctorRepository repository;
	
	@Override
	public Doctor create(Doctor c) {
        return repository.save(c);
		
	}

	@Override
	public Doctor update(Doctor c) {
		return repository.save(c);
		
	}

	@Override
	public void delete(Long id) {
        repository.deleteById(id);
		
	}

	@Override
	public Optional<Doctor> read(Long id) {
        return repository.findById(id); 

	}

	@Override
	public List<Doctor> readAll() {
		return repository.findAll();
	}
}
