package com.nit.libraryManagement;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


@WebServlet("/update")
public class UpdateBookServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		BookBean bb=new BookBean();
		bb.setId(req.getParameter("id"));
		bb.setName(req.getParameter("name"));
		bb.setAuthorName(req.getParameter("author"));
		bb.setPrice(Integer.parseInt(req.getParameter("price")));
		bb.setQuantity(Integer.parseInt(req.getParameter("qty")));
		
		int k=new UpdateBookDAO().updateBook(bb);
		if(k>0)
		{
			//updated
			req.setAttribute("msg", "Book Data Updated Successfully!");
			RequestDispatcher rq=req.getRequestDispatcher("updatebook.jsp");
			rq.forward(req, resp);
		}
		else
		{
			//not updated
			req.setAttribute("msg", "Book Data not Updated");
			RequestDispatcher rq=req.getRequestDispatcher("updatebook.jsp");
			rq.forward(req, resp);
		}
		
	}

}
