package com.rays;


import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;

public class TwoParaExam {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		CallableStatement ps = con.prepareCall("{call hello(?,?)}");
		ps.setInt(1,1);
		ps.registerOutParameter(2, Types.VARCHAR);
		
		ps.execute();

//ps.getInt(1);

		System.out.println(ps.getString(2));
	}



	}


