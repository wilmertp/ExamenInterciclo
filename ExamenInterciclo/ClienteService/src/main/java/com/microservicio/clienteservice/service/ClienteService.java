package com.microservicio.clienteservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicio.clienteservice.entity.Cliente;
import com.microservicio.clienteservice.repository.ClienteRepository;

@Service
public class ClienteService {

	private final ClienteRepository clienteRepository;
	
	public ClienteService(ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente createCliente(Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClienteById(Integer cedula) {
		return clienteRepository.findById(cedula).get();
	}
	
	public List<Cliente> findAll(){
		return clienteRepository.findAll();
	}

	public void delete(Integer cedula) {
		clienteRepository.deleteById(cedula);
	}
	
}
