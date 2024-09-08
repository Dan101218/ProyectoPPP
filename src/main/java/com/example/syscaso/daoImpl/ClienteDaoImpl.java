package com.example.syscaso.daoImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Component;

import com.example.syscaso.dao.ClienteDao;
import com.example.syscaso.entity.Cliente;
import com.example.syscaso.repository.ClienteRepository;
@Component
public class ClienteDaoImpl  implements ClienteDao{
    @Autowired
    private ClienteRepository clienteRepository;
	@Override
	public Cliente create(Cliente r) {
		// TODO Auto-generated method stub
		return clienteRepository.save(r);
	}

	@Override
	public Cliente update(Cliente r) {
		// TODO Auto-generated method stub
		return clienteRepository.save(r);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		clienteRepository.deleteById(id);
	}

	@Override
	public Cliente read(Long id) {
		// TODO Auto-generated method stub
		return clienteRepository.findById(id).get();
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteRepository.findAll();
	}

}