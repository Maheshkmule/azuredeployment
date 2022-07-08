package com.springapi2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Azuredemoapi1Application {
	
	 @GetMapping("/message")
		public String message() {
			return "The application deployed successfully";
		}

	public static void main(String[] args) {
		SpringApplication.run(Azuredemoapi1Application.class, args);
	}

}
