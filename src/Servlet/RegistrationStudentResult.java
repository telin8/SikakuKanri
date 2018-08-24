package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegistrationStudentDAO;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/RegistrationStudentResult")
public class RegistrationStudentResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationStudentResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String studentID = request.getParameter("studentid");
		String studentName = request.getParameter("studentname");
		String studentAGE = request.getParameter("studentage");
		String studentGender = request.getParameter("studentgender");
		int studentId = Integer.parseInt(studentID);
		int studentAge = Integer.parseInt(studentAGE);

		RegistrationStudentDAO.RegistrationStudent(studentId,studentName,studentAge,studentGender);
		String view = "/WEB-INF/view/registrationstudentresult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(view);
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
