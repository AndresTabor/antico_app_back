package com.antico_app.product.application.useCases;

import com.antico_app.product.application.useCases.interfaces.ProductUseCase;
import com.antico_app.product.domain.entities.Product;
import com.antico_app.product.domain.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductUserCaseImpl implements ProductUseCase {

    @Autowired
    private ProductService productService;

    @Override
    public Product getProductById(Long id) {
        return productService.getProductById(id);
    }
}
