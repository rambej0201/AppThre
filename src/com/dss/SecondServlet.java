package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SecondServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public SecondServlet() {
        //super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//general settings
		response.setContentType("text/html");
		PrintWriter p = response.getWriter();
		
		//ServletConfig object 
		ServletConfig f = this.getServletConfig();
		
		String x = f.getInitParameter("Sandeles");
		String y = f.getInitParameter("Shoe");
		
		p.println("###### Second Servlet Data #####");
		p.println("<br>");
		p.println("Config Object First Parameter Value is "+x);
		p.println("<br>");
		p.println("Config Object Second Parameter Value is "+y);
		p.println("<br>");
		
		//lets declare ServletContext object through ServletConfig object f
		
		ServletContext c = f.getServletContext();
		
		String m = c.getInitParameter("username");
		String n = c.getInitParameter("password");
		
		p.println("##### Second Servlet Data #####");
		p.println("<br>");
		p.println("Context object First Parameter value is "+m);
		p.println("<br>");
		p.println("Context object Second Parameter value is "+n);
		p.println("<br>");
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
