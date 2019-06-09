package quan.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
//http://localhost:8080/ProjectServlet/HelloServlet
@WebServlet(description = "This is Servlet Hello World", urlPatterns = { "/login" })
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public HelloServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		printWriter.print("Hello World By Get............");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter printWriter = response.getWriter();
		printWriter.println("Hello World By Post............<br/>");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		
		
		if(username.equals("abcd") && password.equals("123456")) {
			printWriter.println("hello:" + username);
		} else {
			printWriter.println("username or password is wrong ...");
		}
		
	}

}
