package com.ratana.ServletJSPMaven;
import java.io.IOException;

import com.ratana.ServletJSPMaven.Dao.AlienDao;
import com.ratana.ServletJSPMaven.model.Alien;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MySevletMavenWeb extends HttpServlet {
	Alien alien = new Alien();
	AlienDao alienDao = new AlienDao();
	public void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException{
		int id = Integer.parseInt(request.getParameter("aid"));
		  alien=alienDao.getAlien(id); request.setAttribute("aline", alien);
		 
		RequestDispatcher rd = request.getRequestDispatcher("display.jsp");
		rd.forward(request, response);
	}
}
