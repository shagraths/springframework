package com.acu.beans;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class GenericBeanPostProcessor implements BeanPostProcessor {
	@Override
	public Object postProcessAfterInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Después de la Inicialización: "+nombreBean);
		return null;
	}
	@Override
	public Object postProcessBeforeInitialization(Object bean, String nombreBean) throws BeansException {
		System.out.println("Antes de la Inicialización: "+nombreBean);
		return null;
	}
}