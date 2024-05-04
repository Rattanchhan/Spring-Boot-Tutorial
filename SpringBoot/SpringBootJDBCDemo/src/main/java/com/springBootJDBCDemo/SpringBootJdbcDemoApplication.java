package com.springBootJDBCDemo;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.springBootJDBCDemo.model.Alien;
import com.springBootJDBCDemo.repo.AlienRepo;

@SpringBootApplication
public class SpringBootJdbcDemoApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=	SpringApplication.run(SpringBootJdbcDemoApplication.class, args);
		Alien alien = context.getBean(Alien.class);
		
		alien.setaId(111);
		alien.setaName("Ratana");
		alien.setTech("Spring");
		
		AlienRepo alienRepo = context.getBean(AlienRepo.class);
		alienRepo.saveAlien(alien);
		
		List<Alien> allAlien= alienRepo.findAllAlien();
		
		for(Alien OneAlien :allAlien) {
			System.out.println(OneAlien);
		}
		
	}

}