package com.api.products.apiproducts.controller;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * ProductAdmin
 */
@Component
@Scope(org.springframework.beans.factory.config.ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class ProductAdmin implements ProductsModel {

  public ProductAdmin() {
      System.out.println("In constructor: " + getClass().getName());
  }

  @Override
  public String getNameProduct() {
    return "ProductAdmin";
  }

  
}