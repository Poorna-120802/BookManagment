package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AdminLoginDAO 
{
	Connection con=DBConnection.getCon();
	AdminRegBean ab=null;
	public AdminRegBean login(String name,String password)
	{
		try 
		{
			PreparedStatement ps=con.prepareStatement("select * from adminreg where name=? and password=?");
			ps.setString(1, name);
			ps.setString(2, password);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				ab=new AdminRegBean();
				ab.setName(rs.getString(1));
				ab.setPassword(rs.getString(2));
				ab.setFname(rs.getString(3));
				return ab;
			}		
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		return null;
	}

}
