package com.nit.libraryManagement;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ViewAllBooksDAO 
{
	Connection con=DBConnection.getCon();
	ArrayList<BookBean> list=new ArrayList<>();
	public ArrayList<BookBean> viewAllBooks()
	{
		try
		{
			PreparedStatement ps=con.prepareStatement("select * from booksinfo");
			ResultSet rset=ps.executeQuery();
			while(rset.next())
			{
				BookBean bb=new BookBean();
				bb.setId(rset.getString(1));
				bb.setName(rset.getString(2));
				bb.setAuthorName(rset.getString(3));
				bb.setPrice(rset.getInt(4));
				bb.setQuantity(rset.getInt(5));
				
				list.add(bb);
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return list;
	}

}
