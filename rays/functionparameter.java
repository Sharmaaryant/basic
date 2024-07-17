package com.rays;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class functionparameter {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		CallableStatement ps = con.prepareCall("{?=call demo(?)}");

		ps.registerOutParameter(1,Types.VARCHAR);
		ps.setInt(2,1);
		ps.execute();


		System.out.println(ps.getString(1));
		con.close();
	}

	}




