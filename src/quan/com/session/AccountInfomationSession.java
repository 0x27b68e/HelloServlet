package quan.com.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class AccountInfomation
 */
@WebServlet("/AccountInfomationSession")
public class AccountInfomationSession extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountInfomationSession() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = (String)request.getSession().getAttribute("username");
		String password = (String)request.getSession().getAttribute("password");
		if(username == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/session/loginSession.jsp");
			requestDispatcher.forward(request, response);
		} else {		
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("accountDetail.jsp");
			HttpSession session = request.getSession();
			session.setAttribute("employee", new Employee("Quan"));
			session.removeAttribute("employee");
			session.invalidate();
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
