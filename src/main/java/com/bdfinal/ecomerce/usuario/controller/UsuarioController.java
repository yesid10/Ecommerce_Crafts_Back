package com.bdfinal.ecomerce.usuario.controller;

import com.bdfinal.ecomerce.productos.model.Product;
import com.bdfinal.ecomerce.productos.service.ServiceProduct;
import com.bdfinal.ecomerce.usuario.model.Usuario;
import com.bdfinal.ecomerce.usuario.service.ServiceUsuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@CrossOrigin
@RestController
@RequestMapping("/api/v1/usuarios")
public class UsuarioController {

    @Autowired
    private ServiceUsuario serviceUsuario;

    //GET
    @GetMapping("/list")
    public List<Usuario> listUser(){
        return serviceUsuario.getAllUser();
    }

    //GET ONE Product
    @GetMapping("/list/{id}")
    public Usuario listOneUser(@PathVariable Long id){
        return serviceUsuario.getOneUser(id);
    }

    //POST
    @PostMapping("/save")
    public Usuario createUser(@RequestBody Usuario usuario){
        return serviceUsuario.saveUser(usuario);
    }

    //PUT
    @PutMapping("/edit/{id}")
    public Usuario editUser(@RequestBody Usuario usuario, @PathVariable Long id){
        usuario.setUsuarioId(id);
        return serviceUsuario.updateUser(usuario);
    }

    //DELETE
    @DeleteMapping("/delete/{id}")
    public void deleteUser (@PathVariable Long id){
        serviceUsuario.deleteUser(id);
    }
}
