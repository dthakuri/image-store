package com.rab3.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class registerServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String username = req.getParameter("usermname");
		String password  = req.getParameter("password ");
		String name  = req.getParameter("name ");
		String email = req.getParameter("email");
		String gender  = req.getParameter("gender ");
		String image  = req.getParameter("image ");
		
		req.setAttribute("msg","Successly registered");
		req.getRequestDispatcher("register.jsp").forward(req, resp);
	}
	
}

	
