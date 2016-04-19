/**
 * 
 */
package com.david.servlet.dispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author David
 *
 */
@WebServlet("/RegistrationValidator")
public class RegistrationValidator extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public RegistrationValidator() {
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
		PrintWriter out = response.getWriter();
		String firstName = request.getParameter("FirstName");
		String lastName = request.getParameter("LastName");
		String email = request.getParameter("email");
		response.setContentType("text/html");
		if (firstName.equals("") || lastName.equals("") || email.equals("")) {
			out.print("First Name / last name / email is empty");
			RequestDispatcher dispatcher = request.getRequestDispatcher("/RegistrationPage.html");
			dispatcher.include(request, response);
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("RegisteredUser");
			dispatcher.forward(request, response);
		}

	}
}
