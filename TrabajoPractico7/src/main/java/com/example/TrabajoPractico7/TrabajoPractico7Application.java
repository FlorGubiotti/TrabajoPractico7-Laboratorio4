package com.example.TrabajoPractico7;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class TrabajoPractico7Application {

	private static final Logger logger = LoggerFactory.getLogger(TrabajoPractico7Application.class);

	public static void main(String[] args) {
		SpringApplication.run(TrabajoPractico7Application.class, args);
	}


	@Bean
	CommandLineRunner init(){
		return args -> {
			logger.info("Iniciando ...");
		};
	}
}
