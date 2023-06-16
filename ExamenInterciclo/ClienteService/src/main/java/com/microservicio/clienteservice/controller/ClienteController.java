package com.microservicio.clienteservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.clienteservice.entity.Cliente;
import com.microservicio.clienteservice.service.ClienteService;

@RestController
@RequestMapping("/api/clientes")
public class ClienteController {

	public final ClienteService clienteService;
	
	public ClienteController (ClienteService clienteService) {
		this.clienteService = clienteService;
	}
	
	@PostMapping
	public Cliente createCliente(@RequestBody Cliente cliente) {
		return clienteService.createCliente(cliente);
	}
	
	@GetMapping("/{cedula}")
	public Cliente getClienteById(@PathVariable Integer cedula) {
		return clienteService.getClienteById(cedula);
	}
	
	@GetMapping
	public List<Cliente> findAll(){
		return clienteService.findAll();
	}
	
	@PutMapping("/{cedula}")
	public Cliente update(@RequestBody Cliente cliente, @PathVariable Integer cedula) {
		
		Cliente cliente1 = clienteService.getClienteById(cedula);
		
		cliente1.setNombre(cliente.getNombre());
		cliente1.setEmail(cliente.getEmail());
		cliente1.setTelefono(cliente.getTelefono());
		
		return clienteService.createCliente(cliente1);
	}
	
	@DeleteMapping("/{cedula}")
	public void delete(@PathVariable Integer cedula) {
		clienteService.delete(cedula);
	}
	
}
