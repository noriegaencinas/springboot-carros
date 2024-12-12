package com.formaciondbi.springboot.app.item.clientes;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.formaciondbi.springboot.app.item.models.Inventario;

@FeignClient(name = "servicio-carros2")
public interface InventarioClienteRest {
	@GetMapping("/consultar")
	public List<Inventario> consultar();
	
	@GetMapping("/seleccionar/{id}")
	public Inventario especifico(@PathVariable Long id);
}
