package com.api.products.apiproducts.controller;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

/**
 * ProductAdmin
 */
@Component
@Primary
public class ProductAdmin implements ProductsModel {

  @Override
  public String getNameProduct() {
    return "ProductAdmin";
  }

  
}