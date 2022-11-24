package com.br.edu.utfpr.agroapi1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan
@SpringBootApplication
public class AgroApi1Application {

	public static void main(String[] args) {
		SpringApplication.run(AgroApi1Application.class, args);
	}


}
