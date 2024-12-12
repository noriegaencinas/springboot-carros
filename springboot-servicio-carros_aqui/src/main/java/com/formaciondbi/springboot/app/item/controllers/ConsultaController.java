package com.formaciondbi.springboot.app.item.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.formaciondbi.springboot.app.item.models.Inventario;
import com.formaciondbi.springboot.app.item.models.Consulta;
import com.formaciondbi.springboot.app.item.models.service.ConsultaService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class ConsultaController {
	
	@Autowired
	@Qualifier("serviceFeignConsulta")
	private ConsultaService consultaService;
	
	@GetMapping("/consultar")
	public List<Consulta> consultar() {
		return consultaService.todo();
	}
	
	@HystrixCommand(fallbackMethod = "MetodoAlternativo")
	@GetMapping("/seleccionar/{id}")
	public Consulta solouno(@PathVariable Long id) {
		return consultaService.solouno(id);
	}
	
	public Consulta MetodoAlternativo(Long id) {
		Consulta consulta = new Consulta();
		Inventario producto = new Inventario();
		
		producto.setId(id);
		producto.setCantidad(123);
		consulta.setInventario(producto);
		return consulta;
	}
}
