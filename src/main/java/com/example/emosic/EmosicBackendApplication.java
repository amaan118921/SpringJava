package com.example.emosic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmosicBackendApplication {

	public static void main(String[] args) {
		public String PORT = System.getenv("PORT");
		SpringApplication.run(EmosicBackendApplication.class, args);
	}

}
