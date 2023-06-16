package com.microservicio.productoservice.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microservicio.productoservice.entity.Producto;
import com.microservicio.productoservice.service.ProductoService;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

	public final ProductoService productoService;
	
	public ProductoController (ProductoService productoService) {
		this.productoService = productoService;
	}
	
	@PostMapping
	public Producto createProducto(@RequestBody Producto producto) {
		return productoService.createProducto(producto);
	}
	
	@GetMapping("/{codProducto}")
	public Producto getProductoById(@PathVariable Integer codProducto) {
		return productoService.getProductoById(codProducto);
	}
	
	@GetMapping
	public List<Producto> findAll(){
		return productoService.findAll();
	}
	
	@PutMapping("/{codProducto}")
	public Producto update(@RequestBody Producto producto, @PathVariable Integer codProducto) {
		
		Producto prod = productoService.getProductoById(codProducto);
		
		prod.setDescripcion(producto.getDescripcion());
		prod.setPrecio(producto.getPrecio());
		
		return productoService.createProducto(prod);
	}
	
	@DeleteMapping("/{codProducto}")
	public void delete(@PathVariable Integer codProducto) {
		productoService.delete(codProducto);
	}
	
}
