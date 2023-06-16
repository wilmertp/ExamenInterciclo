package com.microservicio.comprasservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDTO {

	private Integer id;
	private Integer cedula;
	private String nombre;
	private String email;
	private Integer telefono;
}
