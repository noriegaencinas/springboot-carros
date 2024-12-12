package com.formaciondbi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formaciondbi.springboot.app.item.models.Carro;

@FeignClient(name = "servicio-carros")
public interface CarrosClienteRest {

	@GetMapping("/listar")
	public List<Carro> listar();
	
	@GetMapping("/ver/{id}")
	public Carro detalle(@PathVariable Long id);
}