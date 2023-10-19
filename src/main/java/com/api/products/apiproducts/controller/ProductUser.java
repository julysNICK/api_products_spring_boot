package com.api.products.apiproducts.controller;

import org.springframework.stereotype.Component;

@Component
public class ProductUser implements ProductsModel {

  @Override
  public String getNameProduct() {
    return "ProductUser";
  }
  
}
