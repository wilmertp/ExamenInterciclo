package com.microservicio.comprasservice.dto;

import com.microservicio.comprasservice.entity.Compras;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseDTO {

	private ClienteDTO clienteDTO;
	private ProductoDTO productoDTO;
	private Compras compras;
}
