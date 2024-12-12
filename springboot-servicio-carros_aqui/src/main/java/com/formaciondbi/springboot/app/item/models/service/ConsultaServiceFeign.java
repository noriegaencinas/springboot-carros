package com.formaciondbi.springboot.app.item.models.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.formaciondbi.springboot.app.item.clientes.InventarioClienteRest;
import com.formaciondbi.springboot.app.item.models.Consulta;

@Service("serviceFeignConsulta")
@Primary
public class ConsultaServiceFeign implements ConsultaService{
	
	@Autowired
	private InventarioClienteRest clienteFeign;
	
	@Override
	public List<Consulta> todo() {
		// TODO Auto-generated method stub
		return clienteFeign.consultar().stream().map(p -> new Consulta(p)).collect(Collectors.toList());
	}
	
	@Override
	public Consulta solouno(Long id) {
		// TODO Auto-generated method stub
		return new Consulta(clienteFeign.especifico(id));
	}
}
