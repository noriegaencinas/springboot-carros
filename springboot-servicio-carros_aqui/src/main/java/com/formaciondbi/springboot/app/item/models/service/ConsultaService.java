package com.formaciondbi.springboot.app.item.models.service;

import java.util.List;

import com.formaciondbi.springboot.app.item.models.Consulta;

public interface ConsultaService {
	public List<Consulta> todo();
	public Consulta solouno(Long id);
}
