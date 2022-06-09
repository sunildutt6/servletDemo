package com.sunil.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AddingServlet extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		if(req.getParameter("number1")!= null && req.getParameter("number2")!= null) {
		Long num1 = Long.parseLong(req.getParameter("number1"));
		Long num2 = Long.parseLong(req.getParameter("number2"));
		PrintWriter out = res.getWriter();
		out.print("The sum is: " + (num1 + num2));
		}
		
		
	}

}


/*This is created with generic servlet interface which only provide service method to execute*/
/*<servlet>
		<servlet-name>AddingServlet</servlet-name>
		<servlet-class>com.sunil.servlets.AddingServlet</servlet-class>
	</servlet>
	<servlet-mapping>
		<servlet-name>AddingServlet</servlet-name>
		<url-pattern>/add</url-pattern>
	</servlet-mapping>
* this needs to be added in web .xml file*/