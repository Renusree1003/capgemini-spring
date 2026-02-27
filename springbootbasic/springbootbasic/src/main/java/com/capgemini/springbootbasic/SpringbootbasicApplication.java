package com.capgemini.springbootbasic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import jakarta.persistence.EntityManagerFactory;

//@SpringBootApplication
//in place of springbootapplication annotation we use these three annotations
@Configuration
@ComponentScan(basePackages = "com")
@EnableAutoConfiguration
public class SpringbootbasicApplication {

	public static void main(String[] args) {
		ApplicationContext ioc=SpringApplication.run(SpringbootbasicApplication.class, args);
		
		Doctor doc = ioc.getBean(Doctor.class);
		doc.check();
		EntityManagerFactory emf = ioc.getBean(EntityManagerFactory.class);
		System.out.println(emf);
	}

}
