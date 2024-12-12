package com.formaciondbi.springboot.app.item.models;

import java.sql.Date;

public class Carro {

	private long id;
	private String modelo;
	private long anio;
	private long kilometros;
	private boolean nuevo;
	private Double precio;
	private Date create_at;
	private Integer port;
	
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public long getAnio() {
		return anio;
	}
	public void setAnio(long anio) {
		this.anio = anio;
	}
	public long getKilometros() {
		return kilometros;
	}
	public void setKilometros(long kilometros) {
		this.kilometros = kilometros;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getPort() {
		return port;
	}
	public void setPort(Integer port) {
		this.port = port;
	}
	public long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public Date getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Date create_at) {
		this.create_at = create_at;
	}
}


