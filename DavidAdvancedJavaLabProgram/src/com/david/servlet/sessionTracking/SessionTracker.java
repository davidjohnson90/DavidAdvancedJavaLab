/**
 * 
 */
package com.david.servlet.sessionTracking;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author David
 *
 */
@WebServlet("/SessionTracker")
public class SessionTracker extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * (non-Javadoc)
	 * 
	 * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.
	 * HttpServletRequest, javax.servlet.http.HttpServletResponse)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession(true);
		String title = "Welcome Back";
		Integer visitCount = new Integer(0);
		String visitCountKey = new String("visitCount");
		String userIDKey = new String("userID");
		String userID = new String("1423");
		if (session.isNew()) {
			title = "Welcome Bangalore";
			session.setAttribute(userIDKey, userID);
		} else {
			visitCount = (Integer) session.getAttribute(visitCountKey);
			visitCount = visitCount + 1;
			userID = (String) session.getAttribute(userIDKey);
		}
		session.setAttribute(visitCountKey, visitCount);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String docType = "<!doctype html public \"-//w3c//dtd html 4.0 " + "transitional//en\">\n";
		out.println(docType + "<html> \n" + "<head>" + " <title>" + title + "</title>" + "</head>\n"
				+ "<body bgcolor=\"#f0f0f0\">\n" + "<h1 align=\"center\">" + title + "</h1>\n"
				+ "<h2 align=\"center\">Session Infomation</h2>\n" + "<table border=\"1\" align=\"center\">\n"
				+ "<trbgcolor=\"#949494\">\n" + "  <th>Session info</th><th>value</th></tr>\n"
				+ "  <td>Number of visits</td>\n" + "  <td>" + visitCount + "</td></tr>\n" + "</table>\n"
				+ "</body></html>");
	}
}