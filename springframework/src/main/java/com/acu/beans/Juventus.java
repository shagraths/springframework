package com.acu.beans;

import org.springframework.stereotype.Component;

import com.acu.interfaces.IEquipo;

@Component
public class Juventus implements IEquipo {

	@Override
	public String mostrar() {
		// TODO Auto-generated method stub
		return "Juventus";
	}

}
