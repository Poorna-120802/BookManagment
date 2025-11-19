package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DeleteBookDAO 
{
	Connection con=DBConnection.getCon();
	public int deleteBook(String id)
	{
		int k=0;
		try
		{
			PreparedStatement ps=con.prepareStatement("delete from booksinfo where id=?");
			ps.setString(1, id);
			k=ps.executeUpdate();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			return k;
		}
	
	}

}
