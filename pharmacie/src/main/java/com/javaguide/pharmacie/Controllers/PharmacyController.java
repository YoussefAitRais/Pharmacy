package com.javaguide.pharmacie.Controllers;

import com.javaguide.pharmacie.Entities.Product;
import com.javaguide.pharmacie.Repository.ProductRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PharmacyController {

    private final ProductRepository productRepository;

    public PharmacyController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @PostMapping("/product")
    public Product saveProduct (@RequestBody  Product product) {
        return productRepository.save(product);
    }


    @GetMapping("/product")
    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }


    @DeleteMapping("/product/{id}")
    public void deletProductById( @PathVariable long id) {
        productRepository.deleteById(id);
    }

    @PutMapping("/product")
    public Product updateProduct (@RequestBody Product product) {
        return productRepository.save(product);
    }


}
