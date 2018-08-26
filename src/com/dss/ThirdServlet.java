package com.dss;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ThirdServlet
 */
public class ThirdServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ThirdServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//general settings
		response.setContentType("text/html");
		PrintWriter i = response.getWriter();
		
		//creating servletConfig object
		ServletConfig v = this.getServletConfig();
		
		String m = v.getInitParameter("iPhone");
		String n = v.getInitParameter("Samsung");
		
		i.println("###### Third Servlet Data ######");
		i.println("<br>");
		i.println("ServletConfig first parameter values is "+m);
		i.println("<br>");
		i.println("ServletConfig second parameter value is "+n);
		i.println("<br>");
		
		//creating servletContext object by using servletConfig object
		
		ServletContext u = v.getServletContext();
		
		String o = u.getInitParameter("username");
		String p = u.getInitParameter("password");
		
		i.println("##### ServletContext data from ThirdServlet #####");
		i.println("<br>");
		i.println("ServletContext first parameter value is "+o);
		i.println("<br>");
		i.println("ServletContext second parameter value is "+p);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
	}

}
