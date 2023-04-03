package com.acu.beans;

import com.acu.interfaces.IEquipo;
import org.springframework.beans.factory.annotation.Autowired;

public class Jugador {
	private int numero;
	private String nombre;
	private IEquipo equipo;

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}
	@Autowired
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public IEquipo getEquipo() {
		return equipo;
	}

	@Autowired
	public void setEquipo(IEquipo equipo) {
		this.equipo = equipo;
	}
}
