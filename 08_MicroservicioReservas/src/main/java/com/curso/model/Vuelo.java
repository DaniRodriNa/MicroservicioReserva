package com.curso.model;

import java.util.Date;


/**
 * Clase modelo de Vuelo
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public class Vuelo {
	private int idVuelo;
	private String compania;
	private Date fechaVuelo;
	private double precio;
	private int plazas;
	
	public Vuelo() {
	}

	public Vuelo(int idVuelo, String compania, Date fechaVuelo, double precio, int plazas) {
		this.idVuelo = idVuelo;
		this.compania = compania;
		this.fechaVuelo = fechaVuelo;
		this.precio = precio;
		this.plazas = plazas;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public String getCompania() {
		return compania;
	}

	public void setCompania(String compania) {
		this.compania = compania;
	}

	public Date getFechaVuelo() {
		return fechaVuelo;
	}

	public void setFechaVuelo(Date fechaVuelo) {
		this.fechaVuelo = fechaVuelo;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public String toString() {
		return "Vuelo [idVuelo=" + idVuelo + ", compania=" + compania + ", fechaVuelo=" + fechaVuelo + ", precio="
				+ precio + ", plazas=" + plazas + "]";
	}
	
}
