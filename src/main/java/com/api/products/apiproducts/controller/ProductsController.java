package com.api.products.apiproducts.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

  @GetMapping("/")
  public String index() {
    return "Hello World";
  }


  @GetMapping("/list")
  public String list() {
    return "List of products";
  }
  
}