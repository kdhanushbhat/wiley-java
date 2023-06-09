package com.wiley.jdbcapp;

import java.sql.*;


public class SkillsProcedure {
	public static void main(String[] args) {
		
	}
	public static void getCandidateSkills(int candidateId) {
		ResultSet rs ;
		Connection conn;
		String query = "{call get_candidate_skill(?)}";
		try {
			DBConnection dbc = new DBConnection();
			conn = dbc.createDBConnection();
 			
			
			CallableStatement cstmt = conn.prepareCall(query);
			cstmt.setInt(1, candidateId);
			rs = cstmt.executeQuery();
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
