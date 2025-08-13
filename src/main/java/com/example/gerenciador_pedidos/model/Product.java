package com.example.gerenciador_pedidos.model;

import jakarta.persistence.*;

@Entity
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false, unique = true)
    private String name;
    @Column(name = "value")
    private double price;
    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    public Product(double price, String name, Category category) {
        this.price = price;
        this.name = name;
        this.category = category;
    }
    public Long getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public Category getCategory() {
        return category;
    }

    public Product() {
    }
}
