package com.example.gerenciador_pedidos.repository;

import com.example.gerenciador_pedidos.model.Requests;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RequestsRepository extends JpaRepository<Requests, Long> {}
