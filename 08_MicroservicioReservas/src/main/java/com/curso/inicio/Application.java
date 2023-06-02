package com.curso.inicio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.client.RestTemplate;
/**
 * Clase Application
 * @author Daniel Rodriguez
 * @version 1.0.0 02-06-2023
 */
@EntityScan(basePackages = "com.curso.model")
@EnableJpaRepositories(basePackages = "com.curso.dao")
@SpringBootApplication(scanBasePackages={"com.curso.controller","com.curso.service"})
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	@Bean
	public RestTemplate getTemplate() {
		return new RestTemplate();
	}
}
