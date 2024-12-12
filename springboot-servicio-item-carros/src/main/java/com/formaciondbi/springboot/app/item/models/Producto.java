package com.formaciondbi.springboot.app.item.models;

import java.sql.Date;

//INSERT INTO Carros (modelo, anio, kilometro, nuevo, create_at, precio) VALUES ('Mazda CX-5', 2022, 8000, TRUE, now(), 1000000);

public class Producto {

	private long id;
	private String modelo;
	private int anio; 
	private double kilometro;
	private boolean nuevo;
	private Integer port;
	private double precio;
	private Date createAt;

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public int getAnio() {
		return anio;
	}
	public void setAnio(int anio) {
		this.anio = anio;
	}
	public double getKilometro() {
		return kilometro;
	}
	public void setKilometro(double kilometro) {
		this.kilometro = kilometro;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	
	
}


