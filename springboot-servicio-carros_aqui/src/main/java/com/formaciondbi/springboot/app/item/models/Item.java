package com.formaciondbi.springboot.app.item.models;

public class Item {

	private Carro producto;
	private Integer cantidad;
	
	public Item() {
		
	}
	
	public Item(Carro producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Carro getProducto() {
		return producto;
	}
	public void setProducto(Carro producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
	public Double getTotal() {
		return producto.getPrecio() * cantidad.doubleValue();
	}
	
}
