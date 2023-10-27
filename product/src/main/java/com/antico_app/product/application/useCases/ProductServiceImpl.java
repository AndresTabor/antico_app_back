package com.antico_app.product.application.useCases;

import com.antico_app.product.domain.entities.Product;
import com.antico_app.product.domain.repository.ProductRepository;
import com.antico_app.product.domain.services.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public Product getProductById(Long id) {
        return productRepository.findById(id).orElseThrow();
    }
}
