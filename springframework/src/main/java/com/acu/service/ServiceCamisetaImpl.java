package com.acu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acu.beans.Camiseta;
import com.acu.dao.DAOCamiseta;

@Service
public class ServiceCamisetaImpl implements ServiceCamiseta {
	@Autowired
	private DAOCamiseta daoCamiseta;

	@Override
	public void registrar(Camiseta camiseta) throws Exception {
		try {
			daoCamiseta.registrar(camiseta);
		} catch (Exception e) {
			throw e;
		}
	}
}
