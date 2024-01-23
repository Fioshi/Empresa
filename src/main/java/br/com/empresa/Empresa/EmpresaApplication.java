package br.com.empresa.Empresa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EnableAsync
public class EmpresaApplication {

	public static void main(String[] args) {
		System.out.println("Olá");
		SpringApplication.run(EmpresaApplication.class, args);
	}

}