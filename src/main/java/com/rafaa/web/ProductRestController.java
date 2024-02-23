package com.rafaa.web;

import com.rafaa.entities.Product;
import com.rafaa.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class ProductRestController {
   final private ProductRepository productRepository;
   @GetMapping("/products")
   public List<Product> getAllProducts(){
      return productRepository.findAll();
   }
   @GetMapping("/products/{id}")
   public Product findProduct(@PathVariable Long id){
      return productRepository.findById(id).get();
   }
}
