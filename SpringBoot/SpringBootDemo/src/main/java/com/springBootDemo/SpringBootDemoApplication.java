package com.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springBootDemo.model.Alien;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context =	SpringApplication.run(SpringBootDemoApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		
		alien.setId(1);
		alien.setName("ratana");
		alien.setTech("IT");
		
		System.out.println(alien);
		alien.Computer();
	}

}
