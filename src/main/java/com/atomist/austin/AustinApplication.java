package com.atomist.austin;

import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@ComponentScan
@SpringBootApplication
public class AustinApplication {

	public static void main(String[] args) {
		SpringApplication.run(AustinApplication.class, args);
	}
}
