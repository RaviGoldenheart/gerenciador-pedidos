package com.example.gerenciador_pedidos.repository;

import com.example.gerenciador_pedidos.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {}
