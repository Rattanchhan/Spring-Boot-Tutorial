package com.jstlServletDemo;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.jstlServletDemo.model.Student;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
@WebServlet("/JstlServletDemo")
public class JSTLServlet extends HttpServlet {

	public void doGet(HttpServletRequest request,HttpServletResponse respone) throws ServletException,IOException{
		List<Student> students= new ArrayList<Student>();
		students.add(new Student(1,"ratana","male"));
		students.add(new Student(2,"Panha","female"));
		students.add(new Student(3,"Markara","male"));
		
		String name = "ratana";
		request.setAttribute("name",name);
		
		RequestDispatcher rd = request.getRequestDispatcher("JSTL.jsp");
		rd.forward(request, respone);
	}
}
