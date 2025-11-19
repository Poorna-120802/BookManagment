package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class AdminRegDAO 
{
	public static int insert(AdminRegBean a)
	{
		int k=0;
		Connection con=DBConnection.getCon();
		PreparedStatement ps;
		try 
		{
			ps = con.prepareStatement("insert into adminreg values(?,?,?,?,?,?)");
			ps.setString(1, a.getName());
			ps.setString(2, a.getPassword());
			ps.setString(3, a.getFname());
			ps.setString(4, a.getLname());
			ps.setString(5, a.getMailId());
			ps.setString(6, a.getPhno());
			k=ps.executeUpdate();
		} 
		catch (SQLException e) 
		{
			e.printStackTrace();
		}
		finally
		{
			return k;
		}
		//System.out.println(k);
		
			
	}

}

	
	


