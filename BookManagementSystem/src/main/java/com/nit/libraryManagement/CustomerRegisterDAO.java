package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CustomerRegisterDAO 
{
	Connection con=DBConnection.getCon();
	public int register(CustomerBean cb) 
	{
		int k=0;
		try 
		{
			PreparedStatement ps=con.prepareStatement("insert into customerreg values(?,?,?,?,?,?)");
			ps.setString(1, cb.getcName());
			ps.setString(2, cb.getPassword());
			ps.setString(3, cb.getfName());
			ps.setString(4, cb.getlName());
			ps.setString(5, cb.getMailId());
			ps.setLong(6, cb.getPhno());
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
	}

}
