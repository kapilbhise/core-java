package com.programming.class2;

import java.sql.SQLException;

public class ThrowsClause {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();
	}
	
	static void a() {
		b();
	}
	static void b() {
		//here the exception should be handled
		try {
			System.out.println("B method");
			c();
		}
		catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	static void c() throws SQLException {
		d();
	}
	static void d() throws SQLException {
		e();
	}
	static void e() throws SQLException{
		throw new SQLException("Database Error");
	}

}
