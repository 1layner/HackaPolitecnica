package com.hackapolitecnica;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.hackapolitecnica.config.AppContext;

@SpringBootApplication
public class AppMain {

	public static void main(String[] args){
		SpringApplication.run(AppContext.class, args);
	}
	
}
