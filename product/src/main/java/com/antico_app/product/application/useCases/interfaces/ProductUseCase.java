package com.antico_app.product.application.useCases.interfaces;

import com.antico_app.product.domain.entities.Product;

public interface ProductUseCase {
    Product getProductById(Long id);
}
