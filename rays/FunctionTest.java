package com.rays;
	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Types;

	public class FunctionTest {
		public static void funct() throws SQLException, ClassNotFoundException {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
			CallableStatement cstmt = conn.prepareCall("{? = Call salaryfun()}");

			cstmt.registerOutParameter(1, Types.INTEGER);

			
			cstmt.execute();
			System.out.println(cstmt.getString(1));
			conn.close();
		}

		public static void main(String[] args) throws ClassNotFoundException, SQLException {
			funct();
		}
	}


