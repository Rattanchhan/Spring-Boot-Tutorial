package com.mavenSpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mavenSpringDemo.config.Config;
import com.mavenSpringDemo.dao.Vehicle;
import com.mavenSpringDemo.model.Bike;
import com.mavenSpringDemo.model.Car;
import com.mavenSpringDemo.model.Customer;
import com.mavenSpringDemo.model.Type;

public class App {
	public static void main(String[] args) {
		
		
		/*
		 * ApplicationContext config = new
		 * AnnotationConfigApplicationContext(Config.class);
		 */
		 
		 
		
		/*
		 * ApplicationContext config1 = new
		 * AnnotationConfigApplicationContext(Config.class);
		 */ 
		  
//		
		
		
		  ApplicationContext context = new
		  ClassPathXmlApplicationContext("springCore.xml");
		 
		 		 
		  
			/*
			 * Vehicle vehicle = (Vehicle)config1.getBean(Car.class); vehicle.show();
			 */
		 
		  	Car car = context.getBean(Car.class);
		  	car.show();
		
			/* Bike bike = context.getBean(Bike.class); bike.show(); */
		
		 
		
		/*
		 * Customer customer = (Customer)context.getBean(Customer.class);
		 * customer.show();
		 */
		 

		
			/*
			 * Car car = (Car)context.getBean("car"); car.color="red"; car.show();
			 * 
			 * Car car2 = (Car)context.getBean("car"); car2.show();
			 */

			
//			  Type type= (Type)context.getBean(Type.class); System.out.println(type);
//			 

	}
}
