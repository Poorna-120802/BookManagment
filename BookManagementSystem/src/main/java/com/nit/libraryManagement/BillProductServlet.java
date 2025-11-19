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


@WebServlet("/BillBook")
public class BillProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
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
			String code=req.getParameter("id");
			int qty=Integer.parseInt(req.getParameter("qty"));
			List<BookBean> list=(List<BookBean>) session.getAttribute("list");
			Iterator itr=list.iterator();
			while(itr.hasNext())
			{
				BookBean bb=(BookBean) itr.next();
				if(bb.getId().equals(code))
				{
					req.setAttribute("bean", bb);
					req.setAttribute("qty",qty );
					RequestDispatcher r=req.getRequestDispatcher("BillProduct.jsp");
					r.forward(req, resp);
					break;
				}
			}
		}
	}
}
