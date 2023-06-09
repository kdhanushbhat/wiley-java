package com.wiley.jdbcapp;

import java.sql.*;
import java.io.FileInputStream;
public class BlobWrite {
	public static void main(String[] args) {
		ResultSet rs ;
		Connection conn;
		
		String q = "INSERT INTO students values(?,?)";
		
		try {
			FileInputStream fis = new FileInputStream("C:\\Users\\rocky\\Downloads\\bhatdhanush79@gmail.com.pdf");
			DBConnection dbc = new DBConnection();
			conn = dbc.createDBConnection();
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(q);
 
			ps.setBinaryStream(1, fis);
			ps.setInt(2, 0);
			
			int rowsAffected = ps.executeUpdate();

	        if (rowsAffected > 0) {
	            System.out.println("Insert successful");
	        } else {
	            System.out.println("Insert failed");
	        }

			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
}
