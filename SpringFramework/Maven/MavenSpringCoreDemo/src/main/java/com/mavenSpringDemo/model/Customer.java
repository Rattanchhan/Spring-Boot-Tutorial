package com.mavenSpringDemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.mavenSpringDemo.dao.Vehicle;

/*@Component*/
public class Customer {
	/*
	 * @Autowired
	 * 
	 * @Qualifier("bike")
	 */
	@Autowired
	Vehicle vehicle;
	
	public Vehicle getVehicle() {
		return vehicle;
	}

	
	  public void setVehicle(Vehicle vehicle) { this.vehicle = vehicle; }
	 

	public void show() {
		vehicle.show();
	}
}
