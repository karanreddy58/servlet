package com.servletDemo;

import java.io.IOException;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ServAdd extends HttpServlet{

	public void service(HttpServletRequest req, HttpServletResponse res) throws IOException {
		
		int i= Integer.parseInt(req.getParameter("num1"));
		int j= Integer.parseInt(req.getParameter("num2"));
		
		
	
		
	
	}
}
