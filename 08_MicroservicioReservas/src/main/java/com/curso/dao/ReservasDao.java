package com.curso.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.model.Reserva;
/**
 * Interfaz dao: ReservasDao
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
public interface ReservasDao extends JpaRepository<Reserva, Integer> {

}
