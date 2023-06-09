package com.wiley.jdbcapp;

import java.sql.*;

public class BatchProcessing {
	public static void main(String[] args) {
		ResultSet rs ;
		Connection conn;
		String q1 = "INSERT INTO contacts(fname,lname) VALUES (\"vijay\",\"shankar\");";
		String q2 = "INSERT INTO contacts(fname,lname) VALUES (\"vijay\",\"r\");";
		String q3 = "INSERT INTO contacts(fname,lname) VALUES (\"r\",\"samson\");";
		String q4 = "INSERT INTO contacts(fname,lname) VALUES (\"jj\",\"furlow\");";
		
		try {
			DBConnection dbc = new DBConnection();
			conn = dbc.createDBConnection();
			conn.setAutoCommit(false);
			
			Statement st = conn.createStatement();
			st.addBatch(q1);
			st.addBatch(q2);
			st.addBatch(q3);
			st.addBatch(q4);
//			cstmt.setInt(1, candidateId);
			int[] x = st.executeBatch();
			System.out.println(x);
			conn.commit();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} 
	}
}
