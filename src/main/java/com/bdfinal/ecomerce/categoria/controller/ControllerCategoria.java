package com.bdfinal.ecomerce.categoria.controller;

import com.bdfinal.ecomerce.categoria.model.Categoria;
import com.bdfinal.ecomerce.categoria.service.ServiceCategoria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/categories/")
public class ControllerCategoria {

    @Autowired
    private ServiceCategoria serviceCategoria;

    //GET
    @GetMapping("/list")
    public List<Categoria> listCategories(){
        return  serviceCategoria.getAllCategories();
    }

    //GET ONE
    @GetMapping("/list/{id}")
    public Categoria listOneCategory(@PathVariable Long id){
        return serviceCategoria.getOneCategory(id);
    }

    //POST
    @PostMapping("/save")
    public Categoria createCategory(@RequestBody Categoria categoria){
        return serviceCategoria.saveCategory(categoria);
    }

    //PUT
    @PutMapping("/edit/{id}")
    public Categoria editCategory(@RequestBody Categoria categoria, @PathVariable Long id){
        categoria.setCategoriaId(id);
        return serviceCategoria.updateCategory(categoria);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public void deleteCategory(@PathVariable Long id){
        serviceCategoria.deleteCategory(id);
    }
}
