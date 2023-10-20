
package com.api.products.apiproducts.controller;

/**
 * ProductGeral
 */
public class ProductGeral implements ProductsModel {

  public ProductGeral() {
      System.out.println("In constructor: " + getClass().getName());
  }

  @Override
  public String getNameProduct() {
    // TODO Auto-generated method stub
    return "ProductGeral";
  }

  

  
}