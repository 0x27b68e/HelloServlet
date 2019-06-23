package quan.com;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import quan.com.session.Employee;

/**
 * Servlet implementation class AccountInfomation
 */
@WebServlet("/AccountInfomation")
public class AccountInfomation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountInfomation() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username = (String)request.getAttribute("username");
		if(username == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("accountDetail.jsp");
			
			request.getServletContext().setAttribute("add", "Application Scope");
			request.getSession().setAttribute("add", "Session Scope");
			request.setAttribute("add", "Request Scope");
			
			request.setAttribute("employee", new Employee("A"));
			
			List<Employee> listEmployee = Arrays.asList(new Employee("B"), new Employee("C"), new Employee("D"));
			request.setAttribute("listEmployee", listEmployee);
			
			requestDispatcher.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
