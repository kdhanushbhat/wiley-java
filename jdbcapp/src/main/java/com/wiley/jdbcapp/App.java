package com.wiley.jdbcapp;

import java.sql.*;

public class App 
{
    public static void main( String[] args )
    {
    	try {
			String driver = "com.mysql.cj.jdbc.Driver";
			
			//connection string
			String url = "jdbc:mysql://localhost:3306/wileyclassic";
			String username = "root";
			String password = "passtord";
			
			Class.forName(driver);
			
			Connection conn = DriverManager.getConnection(url, username, password);
			
			String query = "SELECT * FROM employees ORDER BY FIRSTNAME";
			
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				String name = rs.getString("firstName");
				System.out.println(name);
			}
			
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
    }
}
