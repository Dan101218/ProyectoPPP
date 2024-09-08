package com.example.syscaso.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.syscaso.dao.ClienteDao;
import com.example.syscaso.entity.Cliente;
import com.example.syscaso.service.ClienteService;


@Service
public class ClienteServiceImpl implements ClienteService{
    @Autowired
    private ClienteDao clienteDao;
	@Override
	public Cliente create(Cliente c) {
		// TODO Auto-generated method stub
		return clienteDao.create(c);
	}

	@Override
	public Cliente update(Cliente c) {
		// TODO Auto-generated method stub
		return clienteDao.update(c);
	}

	@Override
	public void delete(Long id) {
		clienteDao.delete(id);
		
	}

	@Override
	public Cliente read(Long id) {
		// TODO Auto-generated method stub
		return clienteDao.read(id);
	}

	@Override
	public List<Cliente> readAll() {
		// TODO Auto-generated method stub
		return clienteDao.readAll();
	}

}
