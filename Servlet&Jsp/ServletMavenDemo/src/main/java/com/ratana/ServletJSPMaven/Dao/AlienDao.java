package com.ratana.ServletJSPMaven.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.ratana.ServletJSPMaven.model.Alien;

public class AlienDao {
	String driver = "com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/alien";
	String username="root";
	String password="K@unthea@04@";
	String query = "Select * From tbalien where aid=?";
	public Alien getAlien(int id) {
		Alien alien = new Alien();
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, this.username, this.password);
			PreparedStatement st = connection.prepareStatement(query);
			st.setString(1,id+"");
			
			ResultSet rs = st.executeQuery();
			
			alien.setId(Integer.parseInt(rs.getString(0)));
			alien.setName(rs.getString(1));
			
			return alien;
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		return null;
	}
}
