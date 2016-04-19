/**
 * 
 */
package com.david.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author David
 *
 */
@WebServlet("/StringLength")
public class StringLength extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public StringLength() {
		super();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html><head>");
		out.print("\nEnter a string\n");
		out.println("<form method=POST>");
		out.print("<input type=\"text\"name=\"mode\"");
		out.println("<p>");
		out.println("<input type=submit>");
		out.println("</form></body></html>");
		String s;
		s = request.getParameter("mode");
		int l = s.length();
		out.print("Length of the string&nbsp<b>" + s);
		// out.print("<br>");
		out.print("</b> is &nbsp;" + l);
		out.close();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}
