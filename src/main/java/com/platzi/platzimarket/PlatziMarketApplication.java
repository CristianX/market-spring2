package com.platzi.platzimarket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// Se implementa scanbasePackages debido al Error de reconocimiento en el mapper
@SpringBootApplication(scanBasePackages = { "com.platzi.market.persistence.mapper.ProductMapper" })
public class PlatziMarketApplication {

	public static void main(String[] args) {
		SpringApplication.run(PlatziMarketApplication.class, args);
	}

}
