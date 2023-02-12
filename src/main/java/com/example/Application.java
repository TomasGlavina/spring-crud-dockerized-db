package com.example;

import com.example.controller.UserController;
import com.example.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.controller", "com.example.model", "com.example.repository", "com.example.service", "com.example.config", "com.example.api"})
public class Application {
	public Application() {
	}

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
