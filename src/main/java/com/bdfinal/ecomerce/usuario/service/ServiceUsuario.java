package com.bdfinal.ecomerce.usuario.service;


import com.bdfinal.ecomerce.productos.model.Product;
import com.bdfinal.ecomerce.productos.repository.ProductRepository;
import com.bdfinal.ecomerce.usuario.model.Usuario;
import com.bdfinal.ecomerce.usuario.repository.UsuariosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

import java.util.List;

@Service
@CrossOrigin
public class ServiceUsuario {

    @Autowired
    private UsuariosRepository usuariosRepository;

    // Get all users
    public List<Usuario> getAllUser() {
        return usuariosRepository.findAll();
    }

    //Get one user
    public Usuario getOneUser(Long id) {
        return usuariosRepository.findById(id).orElse(null);
    }

    //Save one user
    public Usuario saveUser(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    //Update User
    public Usuario updateUser(Usuario usuario) {
        return usuariosRepository.save(usuario);
    }

    //Delete User
    public void deleteUser(Long id) {
        usuariosRepository.deleteById(id);
    }
}
