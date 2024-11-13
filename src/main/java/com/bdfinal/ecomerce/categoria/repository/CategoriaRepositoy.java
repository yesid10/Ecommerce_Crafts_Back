package com.bdfinal.ecomerce.categoria.repository;

import com.bdfinal.ecomerce.categoria.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepositoy extends JpaRepository<Categoria, Long> {
}
