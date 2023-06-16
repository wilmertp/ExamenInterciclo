package com.microservicio.comprasservice.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.microservicio.comprasservice.dto.ClienteDTO;
import com.microservicio.comprasservice.dto.ProductoDTO;
import com.microservicio.comprasservice.dto.ResponseDTO;
import com.microservicio.comprasservice.entity.Compras;
import com.microservicio.comprasservice.repository.ComprasRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ComprasService {

	private final ComprasRepository comprasRepository;
	private final RestTemplate restTemplate;
	
	public Compras saveCompras(Compras compras) {
		return comprasRepository.save(compras);
	}
	
	public ResponseDTO getComprasById(Integer numCompra) {
		
		ResponseDTO responseDTO = new ResponseDTO();
		Compras compras = new Compras();
		compras = comprasRepository.findById(numCompra).get();
		
		ResponseEntity<ClienteDTO> responseEntityCliente = restTemplate.getForEntity("http://localhost:8080/api/clientes/"+compras.getCedula(), ClienteDTO.class);
		ResponseEntity<ProductoDTO> responseEntityProducto = restTemplate.getForEntity("http://localhost:8081/api/productos/"+compras.getCodProducto(), ProductoDTO.class);
		
		
		ClienteDTO clienteDTO = responseEntityCliente.getBody();
		ProductoDTO productoDTO = responseEntityProducto.getBody();
		
		responseDTO.setCompras(compras);
		responseDTO.setProductoDTO(productoDTO);
		responseDTO.setClienteDTO(clienteDTO);
		
		return responseDTO;
	}
	
	public List<Compras> findAll(){
		return comprasRepository.findAll();
	}
}
