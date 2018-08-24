package Servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.RegistrationDataDAO;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/RegistrationDataResult")
public class RegistrationDataResult extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegistrationDataResult() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String sikakuID = request.getParameter("sikakuid");
		String sikakuName = request.getParameter("sikakuname");
		String sikakuLEVEL = request.getParameter("sikakulevel");
		String examDate = request.getParameter("examdate");
		String Sof = request.getParameter("sof");
		int sikakuId = Integer.parseInt(sikakuID);
		int sikakuLevel = Integer.parseInt(sikakuLEVEL);


		RegistrationDataDAO.RegistrationData(sikakuId,sikakuName,sikakuLevel,examDate,Sof);
		String view = "/WEB-INF/view/registrationdataresult.jsp";
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
