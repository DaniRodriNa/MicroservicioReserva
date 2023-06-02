package com.curso.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.client.RestTemplate;

import com.curso.dao.ReservasDao;
import com.curso.model.Hotel;
import com.curso.model.Reserva;
import com.curso.model.ReservaConPlazas;
import com.curso.model.Vuelo;
/**
 * Clase que implementa el service: ReservasServiceImpl
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
@Service
public class ReservasServiceImpl implements ReservasService {
	@Autowired
	ReservasDao dao;
	@Autowired
	RestTemplate template;
	
	List<Reserva> reservas=new ArrayList<>();
	private String url="http://localhost";
	
	@Override
	public void reservar(ReservaConPlazas reservaPlazas) {
		template.put(url+":8080/vuelo/{idVuelo}/{plazas}",null,reservaPlazas.getIdVuelo() ,reservaPlazas.getPlazas());
		template.put(url+":9000/hotel/{idHotel}/{disponible}",null,reservaPlazas.getIdHotel(),false);
		Reserva reserva=new Reserva();
		reserva.setDni(reservaPlazas.getDni());
		reserva.setIdHotel(reservaPlazas.getIdHotel());
		reserva.setIdVuelo(reservaPlazas.getIdVuelo());
		reserva.setNombreCliente(reservaPlazas.getNombreCliente());
		dao.save(reserva);
	}

	@Override
	public List<String> listaReservas() {
		String nombre = "";
		Vuelo vuelo=new Vuelo();
		String dni="";
		List<String> reservasPersonalizada=new ArrayList<>();
		List<Hotel> hoteles=Arrays.asList(template.getForObject(url+":9000/hoteles", Hotel[].class));
		List<Vuelo> vuelos=Arrays.asList(template.getForObject(url+":8080/vuelos", Vuelo[].class));
		reservas=dao.findAll();
		for(Hotel hotel:hoteles) {
			for(Reserva reserva:reservas) {
				if(hotel.getIdHotel()==reserva.getIdHotel()) {
					nombre=hotel.getNombre();
					dni=reserva.getDni();
				}
			}
		}
		for(Vuelo vue:vuelos) {
			for(Reserva reserva:reservas) {
				if(vue.getIdVuelo()==reserva.getIdVuelo()) {
					vuelo=vue;
				}
			}
		}
			reservasPersonalizada.add("Nombre: "+nombre+", DNI: "+dni+", Vuelo: "+vuelo);
		
		return reservasPersonalizada;
	}
	/**
	 * Metodo que busca los hoteles disponibles
	 * @param idHotel Identificador del hotel
	 * @return Devuelve el hotel disponible sino no devolvera nada.
	 */
	public Hotel hotelDisponible(int idHotel) {
			Hotel hotel=new Hotel();
		for(Hotel hot:template.getForObject(url+":9000/hoteles", Hotel[].class)) {
			if(hot.getIdHotel()==idHotel) {
				hotel=hot;
			}
		}
		if(hotel.isDisponible()==true) {
			return template.getForObject(url+":9000/hotel/{nombre}", Hotel.class,hotel.getNombre());
		}
		return null;
	}

}
