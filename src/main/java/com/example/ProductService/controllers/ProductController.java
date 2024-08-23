package com.example.ProductService.controllers;

import com.example.ProductService.services.ProductService;
import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/products")
public class ProductController {
   @GetMapping("/hello") //endpoint==>GET /hello
    public String helloWorld(){
        return "Hello World";
    }
    @GetMapping("/hello/{name}") //endpoint==>GET /hello/{name}
    public String helloWithName(@PathVariable("name") String name){
        return "Hello "+name;
    }
    @GetMapping("/show/{showId}/seat/{seatId}")
    public String bmsExample(@PathVariable("showId") String showId ,@PathVariable("seatId") int seatId){
        return "hello "+showId +" your seatno is "+seatId;
    }
   // private ProductService productService;
   /* @GetMapping("/{product_id}")
    public ResponseEntity<String> getProductById(@PathVariable("product_id") int id){
        System.out.println("product id is ");
        return ResponseEntity.ok("created");
    }*/
}
