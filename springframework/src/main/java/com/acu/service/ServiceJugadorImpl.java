package com.acu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acu.beans.Jugador;
import com.acu.dao.DAOJugador;

@Service
public class ServiceJugadorImpl implements ServiceJugador {
	@Autowired
	private DAOJugador daoJugador;

	@Override
	public void registrar(Jugador jugador) throws Exception {
		try {
			daoJugador.registrar(jugador);
		} catch (Exception e) {
			throw e;
		}
	}
	
}
