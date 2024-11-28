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

import com.example.syscaso.entity.Lineacarrera;
import com.example.syscaso.service.LineacarreraService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/lineacarrera")
@CrossOrigin(origins = "http://localhost:4200")
public class LineacarreraController {

    @Autowired
    private LineacarreraService service;

    @GetMapping
    public ResponseEntity<List<Lineacarrera>> readAll() {
        try {
            List<Lineacarrera> lineasCarrera = service.readAll();
            if (lineasCarrera.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(lineasCarrera, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Lineacarrera> crear(@Valid @RequestBody Lineacarrera lineacarrera) {
        try {
            Lineacarrera lc = service.create(lineacarrera);
            return new ResponseEntity<>(lc, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lineacarrera> getLineacarreraId(@PathVariable("id") Long id) {
        try {
            Lineacarrera lineacarrera = service.read(id).orElse(null);
            if (lineacarrera == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(lineacarrera, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delLineacarrera(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Lineacarrera> updateLineacarrera(@PathVariable("id") Long id, @Valid @RequestBody Lineacarrera lineacarrera) {
        Optional<Lineacarrera> existing = service.read(id);
        if (existing.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            Lineacarrera updated = service.update(lineacarrera);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
