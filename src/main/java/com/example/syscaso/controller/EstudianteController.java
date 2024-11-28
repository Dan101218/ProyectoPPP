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

import com.example.syscaso.entity.Estudiante;
import com.example.syscaso.service.EstudianteService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/estudiante")
@CrossOrigin(origins = "http://localhost:4200")
public class EstudianteController {

    @Autowired
    private EstudianteService service;

    @GetMapping
    public ResponseEntity<List<Estudiante>> readAll() {
        try {
            List<Estudiante> estudiantes = service.readAll();
            if (estudiantes.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(estudiantes, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Estudiante> crear(@Valid @RequestBody Estudiante estudiante) {
        try {
            Estudiante e = service.create(estudiante);
            return new ResponseEntity<>(e, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Estudiante> getEstudianteId(@PathVariable("id") Long id) {
        try {
            Estudiante estudiante = service.read(id).orElse(null);
            if (estudiante == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(estudiante, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delEstudiante(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Estudiante> updateEstudiante(@PathVariable("id") Long id, @Valid @RequestBody Estudiante estudiante) {
        Optional<Estudiante> existing = service.read(id);
        if (existing.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            Estudiante updated = service.update(estudiante);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
