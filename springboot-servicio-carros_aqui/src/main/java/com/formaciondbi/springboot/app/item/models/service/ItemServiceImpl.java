package com.formaciondbi.springboot.app.item.models.service;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.formaciondbi.springboot.app.item.models.Item;
import com.formaciondbi.springboot.app.item.models.Carro;

@Service("serviceRestTemplate")
public class ItemServiceImpl implements ItemService {

	@Autowired
	private RestTemplate clienteRest;
	
	@Override
	public List<Item> findAll() {
		List<Carro> productos = Arrays.asList(clienteRest.getForObject("http://servicio-productos/listar", Carro[].class));
		
		return productos.stream().map(p -> new Item(p, 1)).collect(Collectors.toList());
	}

	@Override
	public Item findById(Long id, Integer cantidad) {
		Map<String, String> pathVariables = new HashMap<String, String>();
		pathVariables.put("id", id.toString());
		Carro producto = clienteRest.getForObject("http://servicio-productos/ver/{id}", Carro.class, pathVariables);
		
		return new Item(producto, cantidad);
	}

}