package com.WizerConsulting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.WizerConsulting.repository")
@EntityScan("com.WizerConsulting.model")
public class InventoryXpressApplication {

	public static void main(String[] args) {

		SpringApplication.run(InventoryXpressApplication.class, args);
	}

}
