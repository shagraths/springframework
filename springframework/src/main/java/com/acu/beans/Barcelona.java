package com.acu.beans;

import org.springframework.stereotype.Component;

import com.acu.interfaces.IEquipo;

@Component
public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {		
		return "Barcelona FC";
	}

}
