package com.api.products.apiproducts.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

/**
 * ProductAdmin
 */
@Component
public class ProductAdmin implements ProductsModel {

  public ProductAdmin() {
      System.out.println("In constructor: " + getClass().getName());
  }


  @PostConstruct
  public void init() {
      System.out.println("In init: " + getClass().getName());
  }

  @PreDestroy
  public void destroy() {
      System.out.println("In destroy: " + getClass().getName());
  }

  @Override
  public String getNameProduct() {
    return "ProductAdmin";
  }

  
}