package com.example.gerenciador_pedidos;

import com.example.gerenciador_pedidos.service.GerenciadorPedidos;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class GerenciadorPedidosApplication implements CommandLineRunner {


	public static void main(String[] args) {


		SpringApplication.run(GerenciadorPedidosApplication.class, args);

	}

	@Override
	public void run(String... args) throws Exception{
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

		GerenciadorPedidos gerenciador = context.getBean(GerenciadorPedidos.class);
		gerenciador.executar();
		context.close();

	}
}
