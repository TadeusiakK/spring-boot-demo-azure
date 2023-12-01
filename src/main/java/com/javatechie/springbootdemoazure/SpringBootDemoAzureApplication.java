package com.javatechie.springbootdemoazure;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringBootDemoAzureApplication {


	@GetMapping("/message")
	public String message(){
		return "Message";
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoAzureApplication.class, args);
	}

}
