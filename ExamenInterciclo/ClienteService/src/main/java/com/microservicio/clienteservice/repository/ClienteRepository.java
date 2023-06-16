package com.microservicio.clienteservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.clienteservice.entity.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer>{

}
