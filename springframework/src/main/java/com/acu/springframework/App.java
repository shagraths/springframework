package com.acu.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acu.beans.Marca;
import com.acu.service.ServiceMarca;

public class App {

	public static void main(String[] args) {
		Marca mar = new Marca();
		mar.setId(1);
		mar.setNombre("ADIDAS");
		/*
		 * capa servicio-->capa datos(logica para insertar datos en bd)--> *
		 */
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/acu/xml/beans.xml");
		ServiceMarca sm = (ServiceMarca) appContext.getBean("serviceMarcaImpl");
		try {
			sm.registrar(mar);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
