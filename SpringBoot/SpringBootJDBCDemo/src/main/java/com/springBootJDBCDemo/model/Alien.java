package com.springBootJDBCDemo.model;

import org.springframework.stereotype.Component;

@Component
public class Alien {
	private int aId;
	private String aName;
	private String tech;
	 
	public Alien() {
		super();
	}
	public Alien(int aId, String aName, String tech) {
		super();
		this.aId = aId;
		this.aName = aName;
		this.tech = tech;
	}
	public int getaId() {
		return aId;
	}
	public void setaId(int aId) {
		this.aId = aId;
	}
	public String getaName() {
		return aName;
	}
	public void setaName(String aName) {
		this.aName = aName;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Alien [aId=" + aId + ", aName=" + aName + ", tech=" + tech + "]";
	}
	
	
}
