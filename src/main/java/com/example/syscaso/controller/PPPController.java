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

import com.example.syscaso.entity.PPP;
import com.example.syscaso.service.PPPService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/ppp")
@CrossOrigin(origins = "http://localhost:4200")
public class PPPController {
	@Autowired
	private PPPService service;

	@GetMapping
	public ResponseEntity<List<PPP>> readAll() {
		try {
			List<PPP> PPP = service.readAll();
			if (PPP.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(PPP, HttpStatus.OK);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PostMapping
	public ResponseEntity<PPP> crear(@Valid @RequestBody PPP doc) {
		try {
			PPP d = service.create(doc);
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@GetMapping("/{id}")
	public ResponseEntity<PPP> getPPPId(@PathVariable("id") Long id) {

		try {
			PPP d = service.read(id).get();
			return new ResponseEntity<>(d, HttpStatus.CREATED);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@DeleteMapping("/{id}")
	public ResponseEntity<PPP> delPPP(@PathVariable("id") Long id) {
		try {
			service.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			// TODO: handle exception
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

	@PutMapping("/{id}")
	public ResponseEntity<?> updatePPP(@PathVariable("id") Long id, @Valid @RequestBody PPP doc) {

		Optional<PPP> d = service.read(id);
		if (d.isEmpty()) {
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);

		} else {
			return new ResponseEntity<>(service.update(doc), HttpStatus.OK);
		}

	}
}