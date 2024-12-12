package com.formaciondbi.springboot.app.item.models;

//INSERT INTO inventario (carro_id, cantidad) VALUES (1,10);

public class Item {

	private Producto producto;
	private Integer cantidad;
	
	public Item() {
		
	}
	
	public Item(Producto producto, Integer cantidad) {
		this.producto = producto;
		this.cantidad = cantidad;
	}
	public Producto getProducto() {
		return producto;
	}
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	
}
