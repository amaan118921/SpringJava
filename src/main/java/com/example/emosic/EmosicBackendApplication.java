package com.example.emosic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmosicBackendApplication {

	public static void main(String[] args) {
		//can remove
		String MONGO_USER = System.getenv("MONGO_USER");
		String MONGO_PASSWORD = System.getenv("MONGO_PASSWORD");
		String MONGO_CLUSTER = System.getenv("MONGO_CLUSTER");
		SpringApplication.run(EmosicBackendApplication.class, args);
	}

}
