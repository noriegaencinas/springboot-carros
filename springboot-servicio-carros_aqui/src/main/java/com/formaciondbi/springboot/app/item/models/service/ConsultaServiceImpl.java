package com.formaciondbi.springboot.app.item.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formaciondbi.springboot.app.item.models.Consulta;
import com.formaciondbi.springboot.app.item.models.Inventario;

@Service("serviceRestTemplateConsulta")
public class ConsultaServiceImpl implements ConsultaService {
	
	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Consulta> todo() {
		List<Inventario> productos = Arrays.asList(clienteRest.getForObject("http://servicio-carros/consultar", Inventario[].class));
		
		return productos.stream().map(p -> new Consulta(p)).collect(Collectors.toList());
	}
	
	@Override
	public Consulta solouno(Long id) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Inventario producto = clienteRest.getForObject("http://servicio-carror/consultar/{id}", Inventario.class, pathVariables);
		
		return new Consulta(producto);
	}
}
