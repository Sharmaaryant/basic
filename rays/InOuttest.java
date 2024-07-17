package com.rays;



	import java.sql.CallableStatement;
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.SQLException;
	import java.sql.Types;
	public class InOuttest {
	
	public static void both() throws SQLException, ClassNotFoundException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		CallableStatement cstmt=conn.prepareCall("{Call both(?,?)}");
		cstmt.setInt(1,1);
		cstmt.registerOutParameter(1,Types.VARCHAR);
		
		cstmt.execute();
		System.out.println(cstmt.getString(2));
		conn.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		both();
	}
	}

