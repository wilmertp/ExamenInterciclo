package com.microservicio.clienteservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "clientes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cliente {
	
	@Id
	@Column(nullable = false, unique = true)
	private Integer cedula;
	private String nombre;
	@Column(nullable = false, unique = true)
	private String email;
	private Integer telefono;
}
