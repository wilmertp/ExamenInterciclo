package com.microservicio.productoservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.productoservice.entity.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer>{

}
