package com.microservicio.comprasservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "compras")
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Compras {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numCompra;
	@Column(nullable = false, unique = true)
	private Integer cedula;
	@Column(nullable = false, unique = true)
	private Integer codProducto;
	private Integer cantidad;
	private Double totalCompra;
}
