package com.formaciondbi.springboot.app.item.models;

public class Consulta {
	private Inventario producto;
	
	public Consulta() {
		
	}
	
	public Consulta(Inventario producto) {
		this.producto = producto;
	}
	
	public Inventario getInventario() {
		return producto;
	}
	
	public void setInventario(Inventario producto) {
		this.producto = producto;
	}
}
