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

import com.example.syscaso.entity.Escuela;
import com.example.syscaso.service.EscuelaService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/escuela")
@CrossOrigin(origins = "http://localhost:4200")
public class EscuelaController {

    @Autowired
    private EscuelaService service;

    @GetMapping
    public ResponseEntity<List<Escuela>> readAll() {
        try {
            List<Escuela> escuelas = service.readAll();
            if (escuelas.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(escuelas, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Escuela> crear(@Valid @RequestBody Escuela escuela) {
        try {
            Escuela e = service.create(escuela);
            return new ResponseEntity<>(e, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Escuela> getEscuelaId(@PathVariable("id") Long id) {
        try {
            Escuela escuela = service.read(id).orElse(null);
            if (escuela == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(escuela, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delEscuela(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Escuela> updateEscuela(@PathVariable("id") Long id, @Valid @RequestBody Escuela escuela) {
        Optional<Escuela> existing = service.read(id);
        if (existing.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            Escuela updated = service.update(escuela);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
