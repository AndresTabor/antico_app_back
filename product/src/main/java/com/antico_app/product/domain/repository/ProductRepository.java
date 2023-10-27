package com.antico_app.product.domain.repository;

import com.antico_app.product.domain.entities.Product;

import java.util.Optional;


public interface ProductRepository {
    Optional<Product> findById(Long id);
}
