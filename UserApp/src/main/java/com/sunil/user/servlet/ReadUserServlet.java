package com.sunil.user.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ReadUserServlet
 */
// this is created with again web.xml with servlet, init param servlet mapping
public class ReadUserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Connection connection;

	/**
	 * @see HttpServlet#HttpServlet()
	 */

	public void init(ServletConfig config) {

		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dbUrl"),
					context.getInitParameter("dbUser"), context.getInitParameter("dbPassword"));
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

	}

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from user");
			PrintWriter out = response.getWriter();
			out.print("<table>");
			out.print("<tr>");
			out.print("<th>");
			out.print("First Name");
			out.print("</th>");
			out.print("<th>");
			out.print("Last Name");
			out.print("</th>");
			out.print("<th>");
			out.print("Email");
			out.print("</th>");
			out.print("</tr>");
			while (resultSet.next()) {
				out.print("<tr>");
				out.print("<td>");
				out.print(resultSet.getString(1));
				out.print("</td>");
				out.print("<td>");
				out.print(resultSet.getString(2));
				out.print("</td>");
				out.print("<td>");
				out.print(resultSet.getString(3));
				out.print("</td>");
				out.print("</tr>");
			}
			out.print("</table>");

		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public void destroy() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
