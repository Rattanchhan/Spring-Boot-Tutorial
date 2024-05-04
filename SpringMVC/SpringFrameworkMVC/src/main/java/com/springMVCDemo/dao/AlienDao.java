package com.springMVCDemo.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.springMVCDemo.model.Alien;

@Component
public class AlienDao {
	@Autowired 
	private SessionFactory mysessionFactory;
	@Transactional
	public List<Alien> getAliens(){
		Session session=mysessionFactory.getCurrentSession();
		List<Alien> aliens = session.createQuery("from Alien",Alien.class).list();
		return aliens;
	}
	@Transactional
	public void save(Alien alien) {
		Session session=mysessionFactory.getCurrentSession();
		session.persist(alien);
	}
	@Transactional
	public Alien getAlien(int aid) {
		Session session=mysessionFactory.getCurrentSession();
		Alien alien=session.get(Alien.class,aid);
		return alien;
	}
}