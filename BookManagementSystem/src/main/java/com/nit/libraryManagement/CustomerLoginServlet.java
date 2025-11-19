package com.nit.libraryManagement;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

@WebServlet("/custlog")
public class CustomerLoginServlet extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		String mailid=req.getParameter("mailid");
		String password=req.getParameter("password");
		CustomerBean cb = new CustomerLoginDAO().select(mailid,password);
		if(cb==null)
		{
			req.setAttribute("msg", "fail");
			RequestDispatcher rd=req.getRequestDispatcher("CustLoginFail.jsp");
			rd.forward(req, resp);
		}
		else
		{
			HttpSession session=req.getSession();
			session.setAttribute("cbean", cb);
			RequestDispatcher rd=req.getRequestDispatcher("CustLoginSuccess.jsp");
			rd.forward(req, resp);
		}
	}

}
