package com.microservicio.comprasservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.microservicio.comprasservice.entity.Compras;

public interface ComprasRepository extends JpaRepository<Compras, Integer>{

}
