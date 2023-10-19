package com.api.products.apiproducts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// @SpringBootApplication(
// 	scanBasePackages = {
// 		"com.api.products.apiproducts",
// 		"com.api.products.apiproducts.controllers",
// 		"com.api.products.apiproducts.services",
// 		"com.api.products.apiproducts.models",
// 		"com.api.products.apiproducts.repositories"
// 	}
// )
@SpringBootApplication
public class ApiproductsApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiproductsApplication.class, args);
	}

}
