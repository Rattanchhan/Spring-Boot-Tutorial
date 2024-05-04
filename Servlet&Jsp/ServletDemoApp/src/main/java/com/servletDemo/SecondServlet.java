package com.servletDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class SecondServlet extends HttpServlet {
public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
	
	//**********************RequestDispatcher**********************
	/*
	 * int result = (int)request.getAttribute("result"); PrintWriter out =
	 * response.getWriter(); out.println("In scondServlet result is: "+result);
	 */
		
	//**********************SentRedirect**********************
	
	/*
	 * int result = Integer.parseInt(request.getParameter("result"));
	 * 
	 * PrintWriter out = response.getWriter();
	 * out.println("In scondServlet result is: "+result);
	 */
		
	//**********************HttpSession**********************
	
	/*
	 * HttpSession session = request.getSession();
	 * 
	 * int result = (int)(session.getAttribute("result"));
	 * 
	 * PrintWriter out = response.getWriter();
	 * out.println("In scondServlet result is: "+result);
	 */
	  
	//**********************Cookie**********************
	
	  Cookie cookies[] = request.getCookies();
;	 
	  int result=0;
	  
	  for(Cookie cookie:cookies){
		  if(cookie.getName().equals("result")) {
			  result=Integer.parseInt(cookie.getValue());
		  }
	  }
	  PrintWriter out = response.getWriter();
	  out.println("In scondServlet result is: "+result);
	 
	
	}
}
