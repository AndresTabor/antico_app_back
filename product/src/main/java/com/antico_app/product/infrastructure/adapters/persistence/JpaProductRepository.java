package com.antico_app.product.infrastructure.adapters.persistence;

import com.antico_app.product.domain.entities.Product;
import com.antico_app.product.domain.repository.ProductRepository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaProductRepository extends JpaRepository<Product, Long>, ProductRepository {
}
