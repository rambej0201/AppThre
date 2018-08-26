package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


    public FirstServlet() {
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//general settings
		response.setContentType("text/html");
		PrintWriter r = response.getWriter();
		
		//to get the config object use getServletConfig(), this represents current class, current class extending Servlet Class 
		ServletConfig g = this.getServletConfig();
		
		//We can also declare like ServletConfig g = getServletConfig();
		//to get the configuration details we should use getInitParameter() by using ServletConfig object g 
		String s = g.getInitParameter("Shirt");
		String p = g.getInitParameter("Pant");
		
		//we can also print the in-it parameters data
		//to print in-it parameters data we should add data to PrintWriter object r
		r.println("######## Config InIt Parameteres #########");
		r.println("Config InIt First Parameter is: "+s);
		r.println("<br>");
		r.println("Config InIt Second Parameter is: "+p);
		r.println("<br>");
		
		//Through ServletConfig object g we can also get ServletContext object as like below
		ServletContext t = g.getServletContext();
		
		//By using ServletContext object t we can also print ServletContext related parameters
		String n = t.getInitParameter("username");
		String pa = t.getInitParameter("password");
		
		//lets print Context data
		r.println("######### Context InIt Parameters ##########");
		r.println("<br>");
		r.println("Context InIt First Parameter "+n);
		r.println("<br>");
		r.println("Context InIt Second Parameter "+pa);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
