package com.acu.springframework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.acu.beans.Barcelona;
import com.acu.beans.Camiseta;
import com.acu.beans.Jugador;
import com.acu.beans.Juventus;
import com.acu.beans.Marca;

@Configuration
public class AppConfig {
	@Bean
	public Jugador jugador1() {
		return new Jugador();
	}
	@Bean
	public Barcelona barcelona() {
		return new Barcelona();
	}
	@Bean
	public Juventus juventus() {
		return new Juventus();
	}
	@Bean
	public Camiseta camiseta() {
		return new Camiseta();
	}
	@Bean
	public Marca marca() {
		return new Marca();
	}
}
