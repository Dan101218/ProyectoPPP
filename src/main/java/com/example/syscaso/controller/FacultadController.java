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

import com.example.syscaso.entity.Facultad;
import com.example.syscaso.service.FacultadService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/facultad")
@CrossOrigin(origins = "http://localhost:4200")
public class FacultadController {

    @Autowired
    private FacultadService service;

    @GetMapping
    public ResponseEntity<List<Facultad>> readAll() {
        try {
            List<Facultad> facultades = service.readAll();
            if (facultades.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(facultades, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Facultad> crear(@Valid @RequestBody Facultad facultad) {
        try {
            Facultad f = service.create(facultad);
            return new ResponseEntity<>(f, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Facultad> getFacultadId(@PathVariable("id") Long id) {
        try {
            Facultad facultad = service.read(id).orElse(null);
            if (facultad == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(facultad, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delFacultad(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Facultad> updateFacultad(@PathVariable("id") Long id, @Valid @RequestBody Facultad facultad) {
        Optional<Facultad> existing = service.read(id);
        if (existing.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            Facultad updated = service.update(facultad);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
