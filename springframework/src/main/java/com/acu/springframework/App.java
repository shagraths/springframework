package com.acu.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acu.beans.Camiseta;
import com.acu.beans.Equipo;
import com.acu.beans.Jugador;
import com.acu.beans.Marca;
import com.acu.service.ServiceCamiseta;
import com.acu.service.ServiceEquipo;
import com.acu.service.ServiceJugador;
import com.acu.service.ServiceMarca;

public class App {

	public static void main(String[] args) {	
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/acu/xml/beans.xml");
		
		ServiceCamiseta sc = (ServiceCamiseta) appContext.getBean("serviceCamisetaImpl");
		ServiceEquipo se = (ServiceEquipo) appContext.getBean("serviceEquipoImpl");	
		ServiceJugador sm = (ServiceJugador) appContext.getBean("serviceJugadorImpl");			
		Camiseta cam1 = (Camiseta) appContext.getBean("camiseta1");
		Equipo equi1 = (Equipo) appContext.getBean("equipo1");
		Jugador jug = (Jugador) appContext.getBean("jugador1");
		try {
			sc.registrar(cam1);
			se.registrar(equi1);
			sm.registrar(jug);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
