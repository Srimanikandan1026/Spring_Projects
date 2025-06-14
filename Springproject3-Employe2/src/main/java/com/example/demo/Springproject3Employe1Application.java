package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages="com.example.*")
@EnableJpaRepositories("com.example.*")
@EntityScan("com.example.*")
public class Springproject3Employe1Application {

	public static void main(String[] args) {
		SpringApplication.run(Springproject3Employe1Application.class, args);
	}

}
