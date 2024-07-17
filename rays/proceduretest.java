package com.rays;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Types;



public class proceduretest {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
		CallableStatement ps = con.prepareCall("{call getSalary(?)}");

		//ps.registerOutParameter(1,5);
		ps.setInt(1,3);
		ps.execute();
    

		System.out.println(ps.getString(1));
		con.close();
	}

}
