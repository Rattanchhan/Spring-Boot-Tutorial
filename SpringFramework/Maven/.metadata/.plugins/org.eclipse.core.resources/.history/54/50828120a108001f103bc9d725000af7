package com.mavenSpringDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.mavenSpringDemo.dao.Vehicle;

/*@Component("car")*/
@Component
public class Car implements Vehicle {
	
	public String color;
	
	  @Autowired 
	  private Type type;
	  
	  public Type getType() { return type; }
	  
	  public void setType(Type type) { this.type = type; }
	 
	 

	@Override
	public void show() {
		System.out.println("Vehicle is car...");
		System.out.println("color "+color);
		
	}

	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}

}
