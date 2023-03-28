package com.acu.springframework;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acu.beans.Ciudad;
import com.acu.beans.Persona;

public class App {

	public static void main(String[] args) {
		// se define un contenedor para que spring lo pueda manejar(spring container)
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/acu/xml/beans.xml");
		// Patron de diseño factory donde pasamos un id y nos devuelve la isntancia de
		// un objeto en particular
		Persona per = (Persona) appContext.getBean("persona");
		String nombreCuidades = "";
		for (Ciudad ciu : per.getPais().getCiudades()) {
			nombreCuidades += ciu.getNombre() + "-";
		}
		System.out.println(per.getId() + " " + per.getNombre() + " " + per.getApodo() + " " + per.getPais().getNombre()
				+ " " + nombreCuidades);
		((ConfigurableApplicationContext) appContext).close();
	}

}
