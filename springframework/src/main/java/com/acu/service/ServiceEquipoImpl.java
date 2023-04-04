package com.acu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acu.beans.Equipo;
import com.acu.dao.DAOEquipo;

@Service
public class ServiceEquipoImpl implements ServiceEquipo {
	@Autowired
	DAOEquipo daoEquipo;

	@Override
	public void registrar(Equipo equipo) throws Exception {
		try {
			daoEquipo.registrar(equipo);
		} catch (Exception e) {
			throw e;
		}
	}

}
