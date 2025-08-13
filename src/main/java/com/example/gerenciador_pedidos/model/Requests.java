package com.example.gerenciador_pedidos.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.List;

@Entity
public class Requests {

    @Id
    private Long id;
    @ManyToMany
    @JoinTable(name = "product_request", joinColumns = @JoinColumn(name = "request_id"),
            inverseJoinColumns = @JoinColumn(name = "product_id"))
    private List<Product> product;
    private LocalDate date;
    public Requests(Long id, LocalDate date) {
        this.id = id;
        this.date = date;
    }
    public Long getId() {
        return id;
    }
    public LocalDate getDate() {
        return date;
    }
    public Requests() {
    }
}
