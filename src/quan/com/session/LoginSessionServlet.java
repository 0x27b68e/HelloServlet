package quan.com.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 * 
 * @param <E>
 */
//http://localhost:8080/ProjectServlet/HelloServlet/login
@WebServlet(description = "This is Servlet Hello World", urlPatterns = { "/loginSession" }, initParams = {
		@WebInitParam(name = "username", value = "User Name not provided"),
		@WebInitParam(name = "password", value = "Pass not provided") })
public class LoginSessionServlet<E> extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String PASSWORD = "123456";

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginSessionServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Hello World By Get............");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		HttpSession session = request.getSession();
		session.setMaxInactiveInterval(900);
		session.setAttribute("username", username);
		session.setAttribute("password", password);


		boolean check = LoginSessionServlet.checkLogin(username, password);
		if (check) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/AccountInfomationSession");
			requestDispatcher.forward(request, response);
		} else {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/session/loginSession.jsp");
			requestDispatcher.forward(request, response);
		}

	}

	protected static boolean checkLogin(String username, String password) {
		if(username.equals("abcd") && password.equals(PASSWORD)) {
			return true;
		} else {
			return false;
		}
	}

}
