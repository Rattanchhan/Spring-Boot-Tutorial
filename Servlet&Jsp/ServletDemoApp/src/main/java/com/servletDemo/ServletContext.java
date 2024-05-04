package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServletContext extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		// **********************ServletContext**********************

		
		  jakarta.servlet.ServletContext context = getServletContext();
		  
		  String value1 = context.getInitParameter("name");
		  
		  out.println("ServletContext	value: "+value1);
		 

		// **********************ServletConfig**********************

		jakarta.servlet.ServletConfig config = getServletConfig();

		String value2 = config.getInitParameter("name");

		out.println("ServletConfig	value: " + value2);
	}
}
