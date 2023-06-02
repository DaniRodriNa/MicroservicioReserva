package com.curso.service;

import java.util.List;


import com.curso.model.ReservaConPlazas;

/**
 * Interfaz service: ReservasService
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public interface ReservasService {
	void reservar(ReservaConPlazas reservaPlazas);
	List<String> listaReservas();
}
