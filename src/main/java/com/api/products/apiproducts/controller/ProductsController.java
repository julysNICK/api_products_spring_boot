package com.api.products.apiproducts.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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

  private ProductsModel productsModelAdmin;


  // @Autowired
  // public ProductsController(ProductsModel productsModel) {
  //   this.productsModel = productsModel;
  // }

  // @Autowired
  // public void setProductsModel(@Qualifier("productAdmin") ProductsModel productsModel) {
  //   this.productsModel = productsModel;
  // }


  @Autowired
  public void setProductsModel(@Qualifier("productUser") ProductsModel productsModelUser, @Qualifier("productAdmin") ProductsModel productsModelAdmin) {
      System.out.println("In constructor: " + getClass().getName());
    this.productsModel = productsModelUser;

    this.productsModelAdmin = productsModelAdmin;
  }



  // @Autowired
  // public ProductsController(@Qualifier("productAdmin") ProductsModel productsModel) {
  //   this.productsModel = productsModel;
  // }

  // @Autowired
  // public ProductsController(@Qualifier("productUser") ProductsModel productsModel) {
  //   this.productsModel = productsModel;
  // }

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

  @GetMapping("/check")
  public String check() {
    return "Comparing beans: productAdmin == productUser: " + (productsModelAdmin == productsModel);
  }
  
}