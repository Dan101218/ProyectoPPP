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

import com.example.syscaso.entity.Pelicula;
import com.example.syscaso.service.PeliculaService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/peliculas")
public class PeliculaController{
	
  
	@Autowired
	private PeliculaService peliculaService;
	@GetMapping
	public ResponseEntity<List<Pelicula>> readAll(){
		try {
			List<Pelicula> peliculas = peliculaService.readAll();
			if(peliculas.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(peliculas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping
	public ResponseEntity<Pelicula> crear(@Valid @RequestBody Pelicula pel){
		try {
			Pelicula p = peliculaService.create(pel);
			return new ResponseEntity<>(p, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<Pelicula> getPeliculaId(@PathVariable("id") Long id){
		try {
			Pelicula p = peliculaService.read(id);
			return new ResponseEntity<>(p, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Pelicula> delPelicula(@PathVariable("id") Long id){
		try {
			peliculaService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updatePelicula(@PathVariable("id") Long id, @Valid @RequestBody Pelicula pel){

		Pelicula p = peliculaService.read(id);
			if (p.getId()>0) {
				return new ResponseEntity<>(peliculaService.update(pel), HttpStatus.OK);

			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
	}
}