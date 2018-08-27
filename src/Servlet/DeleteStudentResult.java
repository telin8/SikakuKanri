
package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.DeleteDAO;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/DeleteStudentResult")
public class DeleteStudentResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public DeleteStudentResult() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("Deletestudent") != null) {
			String studentID = request.getParameter("studentdelete");
			int studentId = Integer.parseInt(studentID);
			DeleteDAO.DeleteStudent(studentId);
		} else if (request.getParameter("Deletesikaku") != null) {
			String sikakuID = request.getParameter("sikakudelete");
			int sikakuId = Integer.parseInt(sikakuID);
			DeleteDAO.DeleteData(sikakuId);
		}

		String view = "/WEB-INF/view/deleteresult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
