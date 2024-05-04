package com.loginDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
	String driver = "com.mysql.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/user";
	String username="root";
	String password="K@unthea@04@";
	String query = "Select * From log where username=? and password=?";
	public boolean check(String username, String password) {
		
		try {
			Class.forName(driver);
			Connection connection = DriverManager.getConnection(url, this.username, this.password);
			PreparedStatement st = connection.prepareStatement(query);
			st.setString(1,username);
			st.setString(2, password);
			
			ResultSet rs = st.executeQuery();
			if(rs.next()) {
				return true;
			}
		}catch(Exception exception) {
			exception.printStackTrace();
		}
		return false;
	}

}
