package dev.farhan.movieist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@SpringBootApplication
@RestController
public class MovieistApplication {
	public static void main(String[] args) {
		SpringApplication.run(MovieistApplication.class, args);
	}
	@GetMapping("/root")
	public String apiRoot() {
		return "Hello";
	}
	
}
