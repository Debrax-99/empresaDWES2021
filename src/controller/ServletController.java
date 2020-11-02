package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelBean.EmployeeBean;
import modelBean.PayrollBean;
import service.Services;

/**
 * FP-2DAW Desarrollo Web en Entorno Servidor
 * 
 * @author Ana Blanco Escudero
 *
 * Servlet implementation class ServletController
 */
@WebServlet("/ServletController")
public class ServletController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("action") != null) {
			String action = request.getParameter("action");
			switch (action) {
			case "listEmployees":
				listDispatch(request, response);
				break;

			case "searchEmployee":
				searchDispatch(request, response);
				break;

			case "modifyEmployee":
				modifyDispatch(request, response);
				break;
			}

		} else {
			request.getRequestDispatcher("empresa.jsp").forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("action") != null) {
			String action = request.getParameter("action");
			switch (action) {
			case "getSalary":
				salaryDispatch(request, response);
				break;
			case "getEmployee":
				employeeDispatch(request, response);
				break;
			}
		} else {
			request.getRequestDispatcher("empresa.jsp").forward(request, response);
		}
	}

	public void listDispatch(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Services service = new Services();
		List<EmployeeBean> listEmpBean = service.listEmp();
		request.setAttribute("list", listEmpBean);
		request.getRequestDispatcher("/WEB-INF/View/listEmployees.jsp").forward(request, response);
	}

	public void searchDispatch(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/View/searchEmployee.jsp").forward(request, response);
	}

	public void modifyDispatch(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getRequestDispatcher("/WEB-INF/View/modifyEmployee.jsp").forward(request, response);
	}

	public void salaryDispatch(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Services service = new Services();
		String dni = request.getParameter("dni");
		PayrollBean payroll = service.payroll(dni);
		request.setAttribute("dni", payroll.getDni());
		request.setAttribute("salary", payroll.getSalary());
		request.getRequestDispatcher("/WEB-INF/View/searchEmployee.jsp").forward(request, response);
	}
	
	public void employeeDispatch(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		Services service = new Services();
		String dni = request.getParameter("dni");
		EmployeeBean employee = service.modifyEmp(dni);
		request.setAttribute("employee", employee);
		request.getRequestDispatcher("/WEB-INF/View/modifyEmployee.jsp").forward(request, response);
	}

}
