package com.springMVCDemo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tbalien")
public class Alien {
	@Id
	private int aid;
	private String aname;
	
	public Alien() {
		super();
	}
	public Alien(int aid, String name) {
		super();
		this.aid = aid;
		this.aname = name;
	}
	public int getId() {
		return aid;
	}
	public void setId(int aid) {
		this.aid = aid;
	}
	public String getName() {
		return aname;
	}
	public void setName(String name) {
		this.aname = name;
	}
	@Override
	public String toString() {
		return "Alien [id=" + aid + ", name=" + aname + "]";
	}
	
	
}
