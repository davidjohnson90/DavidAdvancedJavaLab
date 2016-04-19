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
@WebServlet("/GuessNumber")
public class GuessNumber extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public GuessNumber() {
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
		out.print("\nEnter a number between 1 and 100\n");
		out.println("<form method=POST>");
		out.print("<input type=\"text\"name=\"mode\"");
		out.println("<p>");
		out.println("<input type=submit>");
		out.println("</form></body></html>");
		int n1 = 23;
		String n2;
		n2 = request.getParameter("mode");
		int y = Integer.parseInt(n2);
		if (y < n1 && y > 0)
			out.print("Your guess is less");
		else if (y > n1 && y < 100)
			out.print("Your guess is more");
		else if (y == n1)
			out.print("Your guess is correct");
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
