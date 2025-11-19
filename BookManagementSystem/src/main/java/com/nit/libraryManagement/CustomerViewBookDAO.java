package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CustomerViewBookDAO 
{
	Connection con=DBConnection.getCon();
	public List<BookBean> viewBooks()
	{
		List<BookBean> booklist=new ArrayList<>();
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from booksinfo");
			ResultSet r=ps.executeQuery();
			while(r.next())
			{
				BookBean bb=new BookBean();
				bb.setId(r.getString(1));
				bb.setName(r.getString(2));
				bb.setAuthorName(r.getString(3));
				bb.setPrice(r.getInt(4));
				bb.setQuantity(r.getInt(5));
				booklist.add(bb);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally {
			return booklist;
		}
	
	}

}
