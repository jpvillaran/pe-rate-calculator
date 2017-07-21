package com.patriotenergygroup.ratecalculator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.patriotenergygroup.ratecalculator.model.Supplier;
import com.patriotenergygroup.ratecalculator.repository.SupplierRepository;

@SpringBootApplication
public class RateCalculatorApplication {
	
	private static final Logger logger = LoggerFactory.getLogger(RateCalculatorApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(RateCalculatorApplication.class, args);
	}
	
	@Bean
	public CommandLineRunner setup(SupplierRepository supplierRepository) {
		return (args) -> {
			supplierRepository.save(new Supplier("Gustavo"));
			supplierRepository.save(new Supplier("John"));
			supplierRepository.save(new Supplier("Jim "));
			supplierRepository.save(new Supplier("David"));
			logger.info("The sample data has been generated");
		};
	}
	
}
