package com.wiley.jdbcapp;
import java.sql.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.Buffer;
public class BlobR_W {
	public static void Blobwrite() {
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
	
	public static void Blobread() {
		ResultSet rs ;
		Connection conn;
		
		String q = "SELECT resume FROM students WHERE id = ?";
		
		try {
			DBConnection dbc = new DBConnection();
			conn = dbc.createDBConnection();
			conn.setAutoCommit(false);
			PreparedStatement ps = conn.prepareStatement(q);
			ps.setInt(1, 0);
			rs = ps.executeQuery();
			File f = new File("C:\\Users\\rocky\\Desktop\\java.pdf");
			FileOutputStream fout = new FileOutputStream(f);
			while(rs.next()) {
				InputStream is = rs.getBinaryStream("resume");
				byte[] buf = new byte[1024];
				while( is.read(buf) > 0) {
					fout.write(buf);
				}
				
			}
			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
	
	public static void main(String[] args) {
		Blobread();
		
	}
}
