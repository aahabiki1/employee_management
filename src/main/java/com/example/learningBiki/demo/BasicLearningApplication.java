package com.example.learningBiki.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.learningBiki.demo.*")
public class BasicLearningApplication {

	public static void main(String[] args) {
		SpringApplication.run(BasicLearningApplication.class, args);
	}

}
