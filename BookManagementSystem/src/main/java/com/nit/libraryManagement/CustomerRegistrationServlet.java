package com.nit.libraryManagement;

import java.io.IOException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/custreg")
public class CustomerRegistrationServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		CustomerBean cb=new CustomerBean();
		cb.setcName(req.getParameter("name"));
		cb.setPassword(req.getParameter("password"));
		cb.setfName(req.getParameter("fname"));
		cb.setlName(req.getParameter("lname"));
		cb.setMailId(req.getParameter("mailid"));
		cb.setPhno(Long.parseLong(req.getParameter("phno")));
		int k = new CustomerRegisterDAO().register(cb);
		if(k>0)
		{
			req.setAttribute("msg", "Registration Done Successfully!");
			RequestDispatcher r=req.getRequestDispatcher("customerreg.jsp");
			r.forward(req, resp);
		}
		else
		{
			req.setAttribute("msg","Registration Failed");
			RequestDispatcher r=req.getRequestDispatcher("customerreg.jsp");
			r.forward(req, resp);
		}
		
		
	}

}
