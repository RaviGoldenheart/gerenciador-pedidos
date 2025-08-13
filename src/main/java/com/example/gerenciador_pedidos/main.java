package com.example.gerenciador_pedidos;

import com.example.gerenciador_pedidos.service.GerenciadorPedidos;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        GerenciadorPedidos gerenciador = context.getBean(GerenciadorPedidos.class);
        gerenciador.executar();
        context.close();

    }
}
