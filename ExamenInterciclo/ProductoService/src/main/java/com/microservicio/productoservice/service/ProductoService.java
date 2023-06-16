package com.microservicio.productoservice.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.microservicio.productoservice.entity.Producto;
import com.microservicio.productoservice.repository.ProductoRepository;

@Service
public class ProductoService {

private final ProductoRepository productoRepository;
	
	public ProductoService(ProductoRepository productoRepository) {
		this.productoRepository = productoRepository;
	}
	
	public Producto createProducto(Producto producto) {
		return productoRepository.save(producto);
	}
	
	public Producto getProductoById(Integer codProducto) {
		return productoRepository.findById(codProducto).get();
	}
	
	public List<Producto> findAll(){
		return productoRepository.findAll();
	}
	
	public void delete(Integer codProducto) {
		productoRepository.deleteById(codProducto);
	}

}
