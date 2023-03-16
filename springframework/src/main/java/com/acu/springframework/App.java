package com.acu.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acu.beans.Mundo;

public class App {

	public static void main(String[] args) {		
		//se define un contenedor para que spring lo pueda manejar(spring container)		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/acu/xml/beans.xml");
		//Patron de diseño factory donde pasamos un id y nos devuelve la isntancia de un objeto en particular
		Mundo m = (Mundo) appContext.getBean("mundoBean");
		System.out.println(m.getSaludo());
		((ConfigurableApplicationContext)appContext).close();
	}

}
