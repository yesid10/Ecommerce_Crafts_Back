package com.bdfinal.ecomerce.usuario.model;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter @Setter
@Table(name = "usuarios")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long usuarioId;

    private String nombre;
    private String email;
    private String password;
    private String rol;
    private String imageUrl;


}
