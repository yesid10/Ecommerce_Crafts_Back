package com.bdfinal.ecomerce.productos.model;

import com.bdfinal.ecomerce.categoria.model.Categoria;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.annotation.processing.Generated;

@Entity
@Getter @Setter
@Table(name = "productos")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long productoId;
    private String nombre;
    private Double precio;
    private String description;
    private String imagen_url;
    private Integer stock;

}
