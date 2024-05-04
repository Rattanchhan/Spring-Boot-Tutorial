package com.springBootDataJPADemo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springBootDataJPADemo.model.Alien;

@Repository
public interface AlienDao extends JpaRepository<Alien,Integer> {
}
