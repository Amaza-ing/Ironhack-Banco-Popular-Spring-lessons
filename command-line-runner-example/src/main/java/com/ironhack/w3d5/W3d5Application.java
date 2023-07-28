package com.ironhack.w3d5;

import com.ironhack.w3d5.components.Academy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class W3d5Application implements CommandLineRunner {

	@Autowired
	Academy academy;

	public static void main(String[] args) {
		SpringApplication.run(W3d5Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		academy.getCourse("Math");
	}
}
