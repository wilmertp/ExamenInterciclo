package com.microservicio.comprasservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class ComprasServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ComprasServiceApplication.class, args);
	}

	@Bean
    RestTemplate restTemplate() {
        return new RestTemplate();
    }
}
