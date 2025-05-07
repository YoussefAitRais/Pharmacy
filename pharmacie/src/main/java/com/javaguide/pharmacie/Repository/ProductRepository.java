package com.javaguide.pharmacie.Repository;

import com.javaguide.pharmacie.Entities.Product;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository


public interface ProductRepository extends CrudRepository<Product, Long> {
}
