package com.antico_app.product.domain.services;

import com.antico_app.product.domain.entities.Product;

public interface ProductService {
    Product getProductById(Long id);
}
