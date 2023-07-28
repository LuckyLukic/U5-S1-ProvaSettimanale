package com.example.U5S1ProvaSettimanale;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class U5S1ProvaSettimanaleApplication {

	public static void main(String[] args) {
		SpringApplication.run(U5S1ProvaSettimanaleApplication.class, args);
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(
				U5S1ProvaSettimanaleApplication.class);
		
		
		
		ctx.close();
	}
	
}
