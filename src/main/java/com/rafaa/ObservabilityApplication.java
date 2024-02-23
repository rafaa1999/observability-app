package com.rafaa;

import com.rafaa.entities.Product;
import com.rafaa.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class ObservabilityApplication {

	public static void main(String[] args) {
		SpringApplication.run(ObservabilityApplication.class, args);

	}

	@Bean
	public CommandLineRunner runner(ProductRepository productRepository){
		return args -> {
			Product product_one = Product.builder()
					.name("product_one")
					.price(45.99)
					.quantity(3)
					.build();
			Product product_two = Product.builder()
					.name("product_two")
					.price(32.99)
					.quantity(5)
					.build();
			Product product_three = Product.builder()
					.name("product_three")
					.price(67.99)
					.quantity(1)
					.build();
			Product product_four = Product.builder()
					.name("product_four")
					.price(75.99)
					.quantity(4)
					.build();
			List<Product> products = List.of(
					product_one, product_two,product_three,product_four
			);
		    productRepository.saveAll(products);
		};
	}

}
