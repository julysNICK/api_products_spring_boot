package com.api.products.apiproducts.controller;

import org.springframework.stereotype.Component;

/**
 * ProductAdmin
 */
@Component
public class ProductAdmin implements ProductsModel {

  public ProductAdmin() {
      System.out.println("In constructor: " + getClass().getName());
  }


  // @PostConstruct
  // public void init() {
  //     System.out.println("In init: " + getClass().getName());
  // }

  // @PreDestroy
  // public void destroy() {
  //     System.out.println("In destroy: " + getClass().getName());
  // }

  @Override
  public String getNameProduct() {
    return "ProductAdmin";
  }

  
}