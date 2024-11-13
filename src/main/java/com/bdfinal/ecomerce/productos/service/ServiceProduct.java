package com.bdfinal.ecomerce.productos.service;

import com.bdfinal.ecomerce.productos.model.Product;
import com.bdfinal.ecomerce.productos.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin
public class ServiceProduct {

    @Autowired
    private ProductRepository productRepository;

    // Get all products
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    //Get one product
    public Product getOneProduct(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    //Save one product
    public Product saveProduct(Product product) {
        return productRepository.save(product);
    }

    //Update product
    public Product updateProduct(Product product) {
        return productRepository.save(product);
    }

    //Delete product
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
