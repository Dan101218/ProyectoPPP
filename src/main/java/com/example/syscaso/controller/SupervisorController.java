package com.example.syscaso.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.syscaso.entity.Supervisor;
import com.example.syscaso.service.SupervisorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/supervisorr")
@CrossOrigin(origins = "http://localhost:4200")
public class SupervisorController {
	@Autowired
	private SupervisorService service;

	@GetMapping
	public ResponseEntity<List<Supervisor>> readAll() {
		try {
			List<Supervisor> doctor = service.readAll();
			if (doctor.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(doctor, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping
	public ResponseEntity<Supervisor> crear(@Valid @RequestBody Supervisor doc) {
		try {
			Supervisor d = service.create(doc);
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<Supervisor> getSupervisorId(@PathVariable("id") Long id) {

		try {
			Supervisor d = service.read(id).get();
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Supervisor> delSupervisor(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updateSupervisor(@PathVariable("id") Long id, @Valid @RequestBody Supervisor doc) {

		Optional<Supervisor> d = service.read(id);
		if (d.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} else {
			return new ResponseEntity<>(service.update(doc), HttpStatus.OK);
		}

	}
}