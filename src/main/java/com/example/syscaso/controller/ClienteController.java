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

import com.example.syscaso.entity.Cliente;
import com.example.syscaso.service.ClienteService;

import jakarta.validation.Valid;


@RestController
@RequestMapping("/api/clientes")
public class ClienteController{
	
  
	@Autowired
	private ClienteService clienteService;
	@GetMapping
	public ResponseEntity<List<Cliente>> readAll(){
		try {
			List<Cliente> clientes = clienteService.readAll();
			if(clientes.isEmpty()) {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
			return new ResponseEntity<>(clientes, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PostMapping
	public ResponseEntity<Cliente> crear(@Valid @RequestBody Cliente cli){
		try {
			Cliente c = clienteService.create(cli);
			return new ResponseEntity<>(c, HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@GetMapping("/{id}")
	public ResponseEntity<Cliente> getClienteId(@PathVariable("id") Long id){
		try {
			Cliente c = clienteService.read(id);
			return new ResponseEntity<>(c, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@DeleteMapping("/{id}")
	public ResponseEntity<Cliente> delCliente(@PathVariable("id") Long id){
		try {
			clienteService.delete(id);
			return new ResponseEntity<>(HttpStatus.NO_CONTENT);
		} catch (Exception e) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	@PutMapping("/{id}")
	public ResponseEntity<?> updateCliente(@PathVariable("id") Long id, @Valid @RequestBody Cliente cli){

		Cliente c = clienteService.read(id);
			if (c.getId()>0) {
				return new ResponseEntity<>(clienteService.update(cli), HttpStatus.OK);

			} else {
				return new ResponseEntity<>(HttpStatus.NO_CONTENT);
			}
		
	}
}
