package com.salesianostriana.dam.bichopedia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
@SpringBootApplication
public class BichoPediaApplication {

	public static void main(String[] args) {
		SpringApplication.run(BichoPediaApplication.class, args);
	}
	
	
}
