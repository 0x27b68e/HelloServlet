package quan.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 * 
 * @param <E>
 */
//http://localhost:8080/ProjectServlet/HelloServlet/login
@WebServlet(description = "This is Servlet Hello World", urlPatterns = { "/login" }, initParams = {
		@WebInitParam(name = "username", value = "User Name not provided"),
		@WebInitParam(name = "password", value = "Pass not provided") })
public class LoginServlet<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String PASSWORD = "123456";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.getWriter().println("Hello World By Post............<br/>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		request.setAttribute("username", username);

		//Test Servlet Context
		String database = getServletContext().getInitParameter("database");
		System.out.println("context param: " + database);

		boolean check = LoginServlet.checkLogin(username, password, true);
		if (check) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/AccountInfomation");
			request.setAttribute("Hi", "Hiiiiiiiiiiiiiii");
			requestDispatcher.forward(request, response);
		} else {
//			response.sendRedirect("fail.jsp");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/login.jsp");
			requestDispatcher.forward(request, response);
		}

	}

	protected static boolean checkLogin(String username, String password, boolean status) {
		if (username.equals("abcd") && password.equals(PASSWORD)) {
			return true;
		} else {
			return false;
		}
	}

}
