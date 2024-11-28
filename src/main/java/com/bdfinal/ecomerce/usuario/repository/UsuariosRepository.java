package com.bdfinal.ecomerce.usuario.repository;

import com.bdfinal.ecomerce.usuario.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuariosRepository extends JpaRepository<Usuario, Long> {

}
