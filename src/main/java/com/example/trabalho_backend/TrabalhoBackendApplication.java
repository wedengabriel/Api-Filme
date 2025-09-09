package com.example.trabalho_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController

public class TrabalhoBackendApplication {
    @GetMapping("/hello-world")
    public String helloWorld() {
        return "Hello World";
    }
	public static void main(String[] args) {
		SpringApplication.run(TrabalhoBackendApplication.class, args);
	}

}
