package com.example.gerenciador_pedidos.service;

import com.example.gerenciador_pedidos.model.Category;
import com.example.gerenciador_pedidos.model.Product;
import com.example.gerenciador_pedidos.repository.CategoryRepository;
import com.example.gerenciador_pedidos.repository.ProductRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class GerenciadorPedidos {
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;

    @PostConstruct
    public void init() {
        if (categoryRepository == null) {
            System.out.println("categoryRepository não foi injetado!");
        } else {
            System.out.println("categoryRepository foi injetado com sucesso!");
        }
    }

    public void executar() {
        init();
        Category eletronics = new Category(1L, "Eletronics");
        Category tools = new Category(2L, "Tools");

        Product notebook = new Product(4500.0,"Notebook", eletronics);
        Product smartphone = new Product(2500.0, "Smartphone", eletronics);
        Product watch = new Product(750.0, "Watch", eletronics);
        Product powerScrewdriver = new Product(300.0, "Power Screwdriver", tools);

        eletronics.setProduct(List.of(notebook, smartphone, watch));
        tools.setProduct(List.of(powerScrewdriver));


        categoryRepository.saveAll(List.of(eletronics, tools));

        System.out.println("Categorias e produtos: ");
        categoryRepository.findAll().forEach(category -> {
            System.out.println("Categorias: " + category.getName());
            category.getProduct().forEach(product -> System.out.println("Produtos: " + product.getName()));
        });
     //   Requests requests = new Requests(1L, LocalDate.now());



    }
}
