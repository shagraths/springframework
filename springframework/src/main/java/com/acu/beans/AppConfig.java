package com.acu.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
 @Bean
	public Mundo mundoAppConfig() {
	 return new Mundo();
 }
}
