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

import com.example.syscaso.entity.Documento;
import com.example.syscaso.service.DocumentoService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/documento")
@CrossOrigin(origins = "http://localhost:4200")
public class DocumentoController {

    @Autowired
    private DocumentoService service;

    @GetMapping
    public ResponseEntity<List<Documento>> readAll() {
        try {
            List<Documento> documentos = service.readAll();
            if (documentos.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(documentos, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Documento> crear(@Valid @RequestBody Documento doc) {
        try {
            Documento d = service.create(doc);
            return new ResponseEntity<>(d, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<Documento> getDocumentoId(@PathVariable("id") Long id) {
        try {
            Documento d = service.read(id).orElse(null);
            if (d == null) {
                return new ResponseEntity<>(HttpStatus.NOT_FOUND);
            }
            return new ResponseEntity<>(d, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delDocumento(@PathVariable("id") Long id) {
        try {
            service.delete(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{id}")
    public ResponseEntity<Documento> updateDocumento(@PathVariable("id") Long id, @Valid @RequestBody Documento doc) {
        Optional<Documento> existing = service.read(id);
        if (existing.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        try {
            Documento updated = service.update(doc);
            return new ResponseEntity<>(updated, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
