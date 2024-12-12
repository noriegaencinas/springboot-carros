package com.formaciondbi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formaciondbi.springboot.app.item.models.Producto;

@FeignClient(name = "servicio-carros")
public interface ProductoClienteRest {

	@GetMapping("/carros/listar")
	public List<Producto> listar();
	
	@GetMapping("/carros/ver/{id}")
	public Producto detalle(@PathVariable Long id);
}