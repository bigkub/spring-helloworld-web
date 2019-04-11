package com.demo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class SpringHelloworldWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringHelloworldWebApplication.class, args);
	}

}
