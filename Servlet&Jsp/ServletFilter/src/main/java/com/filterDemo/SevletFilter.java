package com.filterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/addAlien")
public class SevletFilter extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		
		String name=request.getParameter("aname");
		PrintWriter out = response.getWriter();
		out.println("Myname is : "+name);
	}
}
