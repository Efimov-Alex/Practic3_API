package org.example.mongodb.controller;

import org.example.mongodb.model.Product;
import org.example.mongodb.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProductController {
    @Autowired
    private ProductRepository prodRepo;


    @PostMapping("/addProduct")
    public Product addProduct(@RequestBody Product product) {
        return prodRepo.save(product);
    }


    @GetMapping("/getAllProduct")
    public ResponseEntity<List<Product>> getAllProduct(){
        try {
            List<Product> products = new ArrayList<Product>();

            prodRepo.findAll().forEach(products::add);

            if (products.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(products, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }

     //   return prodRepo.findAll();
    }

    @DeleteMapping("/deleteProduct/{productId}")
    public void deleteProduct(@PathVariable("productId") String productId) {
        prodRepo.deleteById(productId);
    }
}
