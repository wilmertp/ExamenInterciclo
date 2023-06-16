package com.microservicio.comprasservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.comprasservice.dto.ResponseDTO;
import com.microservicio.comprasservice.entity.Compras;
import com.microservicio.comprasservice.service.ComprasService;

@RestController
@RequestMapping("/api/compras")
public class ComprasController {

	private ComprasService comprasService;
	
	@PostMapping
	public Compras saveCompras(@RequestBody Compras compras) {
		return comprasService.saveCompras(compras);
	}
	
	@GetMapping("/{numCompra}")
	public ResponseDTO getComprasById(@PathVariable Integer numCompra) {
		return comprasService.getComprasById(numCompra);
	}
	
	@GetMapping
	public List<Compras> findAll(){
		return comprasService.findAll();
	}
	
}
