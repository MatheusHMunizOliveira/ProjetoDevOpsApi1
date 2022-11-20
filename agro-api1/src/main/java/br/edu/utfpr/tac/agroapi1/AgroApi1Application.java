package br.edu.utfpr.tac.agroapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
public class AgroApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(AgroApi1Application.class, args);
	}

	@GetMapping
	public String hello() {
		return "Olá, servidor funcionando!";
	}

}
