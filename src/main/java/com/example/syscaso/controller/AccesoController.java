package com.example.syscaso.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.syscaso.entity.Acceso;
import com.example.syscaso.service.AccesoService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/accesos")
public class AccesoController{
	
  
	@Autowired
	private AccesoService accesoService;
	@GetMapping
	public ResponseEntity<List<Acceso>> readAll(){
		try {
			List<Acceso> accesos = accesoService.readAll();
			if(accesos.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(accesos, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping
	public ResponseEntity<Acceso> crear(@Valid @RequestBody Acceso acc){
		try {
			Acceso a = accesoService.create(acc);
			return new ResponseEntity<>(a, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<Acceso> getAccesoId(@PathVariable("id") Long id){
		try {
			Acceso a = accesoService.read(id);
			return new ResponseEntity<>(a, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Acceso> delAcceso(@PathVariable("id") Long id){
		try {
			accesoService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateAcceso(@PathVariable("id") Long id, @Valid @RequestBody Acceso acc){

		Acceso a = accesoService.read(id);
			if (a.getId()>0) {
				return new ResponseEntity<>(accesoService.update(acc), HttpStatus.OK);

			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
	}
	
	@PostMapping("/{accesoId}/roles/{rolId}")
	public ResponseEntity<Acceso> registroAccesoRol(@PathVariable Long accesoId, @PathVariable Long rolId){
		 Acceso ac = accesoService.createAccesoRol(accesoId, rolId);
		 return ResponseEntity.ok(ac);
		
	}
}