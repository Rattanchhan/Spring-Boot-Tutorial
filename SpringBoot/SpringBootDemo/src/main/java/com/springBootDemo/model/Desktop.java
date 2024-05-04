package com.springBootDemo.model;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
	public void show() {
		System.out.println("Alien use Desktop");
	}
}
