package com.api.products.apiproducts.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * ProductAdmin
 */
@Component
@Lazy
public class ProductAdmin implements ProductsModel {

  public ProductAdmin() {
      System.out.println("In constructor: " + getClass().getName());
  }

  @Override
  public String getNameProduct() {
    return "ProductAdmin";
  }

  
}