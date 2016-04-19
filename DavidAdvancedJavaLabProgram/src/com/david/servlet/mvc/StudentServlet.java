/**
 * 
 */
package com.david.servlet.mvc;

import java.io.IOException;

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
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public StudentServlet() {
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
		int sid = 1;
		String sidStr = request.getParameter("id");
		if (sidStr != null) {
			sid = Integer.parseInt(sidStr);
		}
		StudentBean studentbean = loadFromDb(sid);
		request.setAttribute("Student", studentbean);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ShowStudentInfo.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @param sid
	 * @return
	 */
	private StudentBean loadFromDb(int sid) {
		StudentBean studentBean = new StudentBean();
		studentBean.setId(sid);
		studentBean.setName("David Johnson");
		studentBean.setAddress("Bangalore");
		return studentBean;
	}

}
