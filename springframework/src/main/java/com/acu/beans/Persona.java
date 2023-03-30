package com.acu.beans;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Persona implements InitializingBean, DisposableBean{
	
	private int id;
	private String nombre;
	private String apodo;

	private Pais pais;
	private Ciudad ciudad;

	/*@PostConstruct
	private void init() {
		System.out.println("Antes de inicializar el bean");
	}

	@PreDestroy
	private void destroy() {
		System.out.println("Bean a punto de ser destruido");
	}*/

	public Pais getPais() {
		return pais;
	}

	public void setPais(Pais pais) {
		this.pais = pais;
	}

	public int getId() {
		return id;
	}

	
	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApodo() {
		return apodo;
	}

	public void setApodo(String apodo) {
		this.apodo = apodo;
	}

	public Ciudad getCiudad() {
		return ciudad;
	}

	public void setCiudad(Ciudad ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Antes de inicializar el bean");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bean a punto de ser destruido");
	}

	
}
