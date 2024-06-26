package com.springBootJDBCDemo.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.springBootJDBCDemo.model.Alien;

@Repository
public class AlienRepo {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	public void saveAlien(Alien alien) {
		String query = "insert into alien (id,name,tech) values(?,?,?)";
		int row=jdbcTemplate.update(query,alien.getaId(),alien.getaName(),alien.getTech());
		System.out.println(row);
	}
	public List<Alien> findAllAlien(){
		String query = "select * from alien";
		List<Alien> aliens = jdbcTemplate.query(query,
							 (rs,rowNumber)->{
								 Alien alien=new Alien();
								 alien.setaId(rs.getInt(1));
								 alien.setaName(rs.getString(2));
								 alien.setTech(rs.getString(3));
								 return alien;
							 }
				);
		return aliens;
	}
}
