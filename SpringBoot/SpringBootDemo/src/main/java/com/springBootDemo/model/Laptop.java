package com.springBootDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
	public void show() {
		System.out.println("Alien use Laptop");
	}
}
