package com.acu.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acu.interfaces.IEquipo;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/acu/xml/beans.xml");
		//Jugador jug = (Jugador) appContext.getBean("messi");
		//System.out.println(jug.getNombre() + "-" + jug.getEquipo().mostrar());
		
		IEquipo equi = (IEquipo) appContext.getBean("juventus");
		System.out.println(equi.mostrar());
		((ConfigurableApplicationContext) appContext).close();
	}

}
