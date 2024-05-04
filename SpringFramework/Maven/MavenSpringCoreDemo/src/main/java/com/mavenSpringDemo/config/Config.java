package com.mavenSpringDemo.config;

import java.awt.JobAttributes.DefaultSelectionType;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import com.mavenSpringDemo.model.Bike;
import com.mavenSpringDemo.model.Car;
import com.mavenSpringDemo.model.Customer;
import com.mavenSpringDemo.model.Type;

@Configuration
//@ComponentScan(basePackages = "com.mavenSpringDemo.model")
public class Config {
	
	  @Bean
	  public Bike getBike() {
		   Bike bike = new Bike();
		  	return bike;
	  }
	  
	  @Bean
	  public Car getCar() { 
		  Car car = new Car();
		  car.setColor("Orange");
		  return car;
	  }
	  
	  @Bean public Type getType() { 
		 Type type= new Type();
		 type.setBrand("Honda");
		 return type;
		  
	  }
	  @Bean
	  @Scope("prototype")
	  public Customer getCustomer1() {
		  Customer customer = new Customer();
			 customer.setVehicle(getBike()); 
		  return customer;
	  }
	  @Bean
	  @Scope("prototype")
	  @Primary
	  public Customer getCustomer2() {
		  Customer customer = new Customer();
			 customer.setVehicle(getCar()); 
		  return customer;
	  }
	 
}