package com.acu.beans;

public class Persona {
	private int id;
	private String nombre;
	private String apodo;

	public Persona(int id, String nombre, String apodo) {
		this.id = id;
		this.nombre = nombre;
		this.apodo = apodo;
	}
	

	public Persona(int id) {
		this.id = id;
	}


	public Persona(String apodo) {
		this.apodo = apodo;
	}


	public int getId() {
		return id;
	}


	public String getNombre() {
		return nombre;
	}



	public String getApodo() {
		return apodo;
	}

}
