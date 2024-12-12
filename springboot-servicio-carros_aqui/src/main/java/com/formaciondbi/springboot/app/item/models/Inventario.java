package com.formaciondbi.springboot.app.item.models;

public class Inventario {
	private long id;
	private long carro_id;
	private long cantidad;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getCarro_id() {
		return carro_id;
	}
	public void setCarro_id(long carro_id) {
		this.carro_id = carro_id;
	}
	public long getCantidad() {
		return cantidad;
	}
	public void setCantidad(long cantidad) {
		this.cantidad = cantidad;
	}
}