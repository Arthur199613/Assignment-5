package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication Commented out to be able to run experiment 2. Use different modules instead
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
		@GetMapping("/hello")
		public String hello(@RequestParam(value = "name",defaultValue = "world") String name){
			return String.format("Hello %s!", name);
		}


}

