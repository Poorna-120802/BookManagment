package com.nit.libraryManagement;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;


import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/PayServlet")
public class CustomerPaymentServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession session=req.getSession(false);
		if(session==null)
		{
			req.setAttribute("msg", "Session Expired!");
			RequestDispatcher r=req.getRequestDispatcher("entry.jsp");
			r.forward(req, resp);
		}
		else
		{
			String id=req.getParameter("id");
			int reqqty=Integer.parseInt(req.getParameter("qty"));
			
			List<BookBean> list=(List<BookBean>)session.getAttribute("list");
			
			for(BookBean bb:list)
			{
				if(bb.getId().equals(id))
				{
					
						if((bb.getQuantity()-reqqty)==0)
						{
							int k=new DeleteBookDAO().deleteBook(id);
							
							if(k>0)
							{
								
								req.setAttribute("msg","payment successfull...<br>");
							}
						}
						else
						{
							int k=new CustomerPaymentDAO().qtyUpdate(id, bb.getQuantity()-reqqty);
							
							if(k>0)
							{
								
								req.setAttribute("msg","payment successfull...<br>");
							}
						}	
						break;
					}
				
			 }
			RequestDispatcher r=req.getRequestDispatcher("paymentSuccess.jsp");
			r.forward(req, resp);
			}
			
			
		}
		
}


