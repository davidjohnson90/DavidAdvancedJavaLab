/**
 * 
 */
package com.david.servlet.dispatcher;

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
@WebServlet("/RegisteredUser")
public class RegisteredUser extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public RegisteredUser() {
		super();
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
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String email = request.getParameter("email");
		out.print("Welcome " + firstName + " " + lastName);
		out.print("<br> Your mail id is " + email);
	}
}
