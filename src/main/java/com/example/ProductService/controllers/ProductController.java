package com.example.ProductService.controllers;

import com.example.ProductService.models.Product;
import com.example.ProductService.services.FakeStoreProductService;
import com.example.ProductService.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/products")
public class ProductController {
  /* @GetMapping("/hello") //endpoint==>GET /hello
    public String helloWorld(){
        return "Hello World";
    }*/
   /* @GetMapping("/hello/{name}") //endpoint==>GET /hello/{name}
    public String helloWithName(@PathVariable("name") String name){
        return "Hello "+name;
    }*/
   /* @GetMapping("/show/{showId}/seat/{seatId}")
    public String bmsExample(@PathVariable("showId") String showId ,@PathVariable("seatId") int seatId){
        return "hello "+showId +" your seatno is "+seatId;
    }*/
    //@Autowired
    private ProductService productService;
    public ProductController(){
        productService=new FakeStoreProductService();
    }

    @GetMapping("/products/{product_id}")
    public ResponseEntity<Product> getProductById(@PathVariable("product_id") int id){
       if(id<1 || id >20){
           return new ResponseEntity<>(HttpStatus.valueOf(400));
       }
        Product product = productService.getProductById(id);
       return new ResponseEntity<>(product,HttpStatus.valueOf(200));
    }
}
