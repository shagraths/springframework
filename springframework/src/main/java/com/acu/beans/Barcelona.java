package com.acu.beans;

import com.acu.interfaces.IEquipo;

public class Barcelona implements IEquipo{

	@Override
	public String mostrar() {		
		return "Barcelona FC";
	}

}
