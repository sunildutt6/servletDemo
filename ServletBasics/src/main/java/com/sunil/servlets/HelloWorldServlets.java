package com.sunil.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class HelloWorldServlets extends GenericServlet {

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><body>");
		out.print("<h1>Hello servlet</h1>");
		out.print("</body></html>");
	}

}


/*This is created with generic servlet interface which only provide service method to execute*/
/*<servlet>
<servlet-name>HelloServlet</servlet-name>
<servlet-class>com.sunil.servlets.HelloWorldServlets</servlet-class>
</servlet>
<servlet-mapping>
<servlet-name>HelloServlet</servlet-name>
<url-pattern>/hello</url-pattern>
</servlet-mapping>* this needs to be added in web .xml file*/