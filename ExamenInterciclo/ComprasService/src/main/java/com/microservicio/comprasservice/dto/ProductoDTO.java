package com.microservicio.comprasservice.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductoDTO {

	private Integer codProducto;
	private String descripcion;
	private Double precio;
}
