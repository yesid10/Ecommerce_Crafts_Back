package com.bdfinal.ecomerce.categoria.service;

import com.bdfinal.ecomerce.categoria.model.Categoria;
import com.bdfinal.ecomerce.categoria.repository.CategoriaRepositoy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin
public class ServiceCategoria {

    @Autowired
    private CategoriaRepositoy categoriaRepositoy;

    //Get category
    public List<Categoria> getAllCategories(){
        return categoriaRepositoy.findAll();
    }

    //Get One Category
    public Categoria getOneCategory(Long id){
        return categoriaRepositoy.findById(id).orElse(null);
    }

    //Save Category
    public Categoria saveCategory(Categoria categoria){
        return categoriaRepositoy.save(categoria);
    }

    //Update Category
    public Categoria updateCategory(Categoria categoria){
        return  categoriaRepositoy.save(categoria);
    }

    //Delete Category
    public void deleteCategory(Long id){
        categoriaRepositoy.deleteById(id);
    }
}
