package com.hackapolitecnica.config;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan(basePackages = { "com.hackapolitecnica" })
public class HackaCommerceApplicationContext {

	@Bean(name = "applicationProperty")
	public ApplicationProperty getApplicationProperty() {return new ApplicationProperty();}
	
}
