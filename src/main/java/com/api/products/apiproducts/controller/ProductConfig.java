package com.api.products.apiproducts.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * ProductConfig
 */
@Configuration
 public class ProductConfig {


  @Bean
  public ProductGeral productGeral() {
    return new ProductGeral();
  }
  
}