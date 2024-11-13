package com.bdfinal.ecomerce.productos.controller;


import com.bdfinal.ecomerce.productos.model.Product;
import com.bdfinal.ecomerce.productos.service.ServiceProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/products")
public class ControllerProduct {

    @Autowired
    private ServiceProduct serviceProduct;

    //GET
    @GetMapping("/list")
    public List<Product> listProducts(){
        return serviceProduct.getAllProducts();
    }

    //GET ONE Product
    @GetMapping("/list/{id}")
    public Product listOneProduct(@PathVariable Long id){
        return serviceProduct.getOneProduct(id);
    }

    //POST
    @PostMapping("/save")
    public Product createProduct(@RequestBody Product product){
        return serviceProduct.saveProduct(product);
    }

    //PUT
    @PutMapping("/edit/{id}")
    public Product editProduct(@RequestBody Product product, @PathVariable Long id){
        product.setProductoId(id);
        return serviceProduct.updateProduct(product);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public void deleteProduct (@PathVariable Long id){
        serviceProduct.deleteProduct(id);
    }
}
