package com.bdfinal.ecomerce.productos.repository;

import com.bdfinal.ecomerce.productos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
