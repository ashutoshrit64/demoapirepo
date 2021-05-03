package com.bridgelabz.demo5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@ComponentScan("com.bridgelabz.demo5")
@EnableJpaRepositories("com.bridgelabz.demo5.repository")
public class Demo52Application {

	public static void main(String[] args) {
		SpringApplication.run(Demo52Application.class, args);
	}

}
