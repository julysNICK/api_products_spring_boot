package com.api.products.apiproducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

  @Value("${coach.name}")
  private String coach;


  @Value("${team.name}")
  private String team;


  private ProductsModel productsModel;


  // @Autowired
  // public ProductsController(ProductsModel productsModel) {
  //   this.productsModel = productsModel;
  // }

  @Autowired
  public void setProductsModel(ProductsModel productsModel) {
    this.productsModel = productsModel;
  }

  @GetMapping("/")
  public String index() {
    return "Hello World";
  }


    @GetMapping("/productName")
  public String productName() {
    return "The product name is: " + productsModel.getNameProduct();
  }


  @GetMapping("/list")
  public String list() {
    return "List of products";
  }
  
}