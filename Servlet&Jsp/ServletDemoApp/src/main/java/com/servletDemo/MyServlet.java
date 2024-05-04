package com.servletDemo;

import java.io.IOException;
/*
import jakarta.servlet.RequestDispatcher;*/
import jakarta.servlet.ServletException;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
/*import jakarta.servlet.http.HttpSession;*/

public class MyServlet extends HttpServlet {
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		

		int number1 = Integer.parseInt(request.getParameter("number1"));
		int number2 = Integer.parseInt(request.getParameter("number2"));
		int result = number1 + number2;
		
		/*
		 * PrintWriter out = response.getWriter(); out.println("Result: "+result);
		 */
		
		//**********************RequestDispatcher**********************
		
		/*
		 * request.setAttribute("result", result); RequestDispatcher rd =
		 * request.getRequestDispatcher("SecondServlet"); rd.forward(request, response);
		 */
		
		//**********************SentRedirect**********************
		
		/* response.sendRedirect("SecondServlet?result=" + result); */
		
		
		//**********************HttpSession**********************
		
		/*
		 * HttpSession session = request.getSession();
		 * session.setAttribute("result",result);
		 * 
		 * response.sendRedirect("SecondServlet");
		 */
		
		//**********************Cookie**********************
		
		Cookie cookie = new Cookie("result",result+"");
		response.addCookie(cookie);
		
		response.sendRedirect("SecondServlet");
		
	}
}
