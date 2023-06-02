package com.curso.model;
/**
 * Clase modelo auxiliar de HotelConPlazas
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public class ReservaConPlazas {
	private int idVuelo;
	private int idHotel;
	private String nombreCliente;
	private String dni;
	private int plazas;
	
	public ReservaConPlazas() {
	}

	public ReservaConPlazas(int idVuelo, int idHotel, String nombreCliente, String dni, int plazas) {
		this.idVuelo = idVuelo;
		this.idHotel = idHotel;
		this.nombreCliente = nombreCliente;
		this.dni = dni;
		this.plazas = plazas;
	}

	public int getIdVuelo() {
		return idVuelo;
	}

	public void setIdVuelo(int idVuelo) {
		this.idVuelo = idVuelo;
	}

	public int getIdHotel() {
		return idHotel;
	}

	public void setIdHotel(int idHotel) {
		this.idHotel = idHotel;
	}

	public String getNombreCliente() {
		return nombreCliente;
	}

	public void setNombreCliente(String nombreCliente) {
		this.nombreCliente = nombreCliente;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public int getPlazas() {
		return plazas;
	}

	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	
}
