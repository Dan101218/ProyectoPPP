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

import com.example.syscaso.entity.Evaluacion;
import com.example.syscaso.service.EvaluacionService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/evaluacion")
@CrossOrigin(origins = "http://localhost:4200")
public class EvaluacionController {

    @Autowired
    private EvaluacionService service;

    @GetMapping
    public ResponseEntity<List<Evaluacion>> readAll() {
        try {
            List<Evaluacion> evaluaciones = service.readAll();
            if (evaluaciones.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(evaluaciones, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Evaluacion> crear(@Valid @RequestBody Evaluacion evaluacion) {
        try {
            Evaluacion e = service.create(evaluacion);
            return new ResponseEntity<>(e, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Evaluacion> getEvaluacionId(@PathVariable("id") Long id) {
        try {
            Evaluacion evaluacion = service.read(id).orElse(null);
            if (evaluacion == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(evaluacion, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delEvaluacion(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Evaluacion> updateEvaluacion(@PathVariable("id") Long id, @Valid @RequestBody Evaluacion evaluacion) {
        Optional<Evaluacion> existing = service.read(id);
        if (existing.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            Evaluacion updated = service.update(evaluacion);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
