package com.filterDemo;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpServletRequest;

@WebFilter("/addAlien")
public class implementFIlter implements Filter {

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		PrintWriter out = arg1.getWriter();
		HttpServletRequest req = (HttpServletRequest) arg0;
		int id = Integer.parseInt(req.getParameter("aid"));
		
		if(id>0) {
			arg2.doFilter(arg0, arg1);
		}
		else {
			out.println("invalid...");
		}
		
	}
	public void init(FilterConfig fConfig) throws ServletException {}
	public void destroy() {}

}
