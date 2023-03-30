package com.acu.springframework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.acu.beans.Ciudad;
import com.acu.beans.Persona;

public class App {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("com/acu/xml/beans.xml");
		Persona per = (Persona) appContext.getBean("persona");
		System.out.println(per.getApodo());
		Ciudad ciu = (Ciudad) appContext.getBean("ciudad");
		System.out.println(ciu.getNombre());
		((ConfigurableApplicationContext) appContext).close();
	}

}
