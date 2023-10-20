package com.api.products.apiproducts.controller;

import org.springframework.stereotype.Component;

@Component
public class ProductUser implements ProductsModel {


  public ProductUser() {
    System.out.println("In constructor: " + getClass().getName());
  }

  @Override
  public String getNameProduct() {
    return "ProductUser";
  }
  
}
