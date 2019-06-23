package quan.com.cookies;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AccountInfomation
 */
@WebServlet("/AccountInfomationCookies")
public class AccountInfomationCookies extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AccountInfomationCookies() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String username = null;
		String password = null;
		Cookie[] cookies = request.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println("cookies name: " + cookie.getName() + "cookies: " + cookie.getValue() + cookie.getMaxAge());
			if(cookie.getName().equals("username")) {
				username = cookie.getValue();
			}
			if(cookie.getName().equals("password")) {
				password = cookie.getValue();
			}
		}
		request.setAttribute("password", password);
		
		if(username == null) {
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/cookies/loginCookies.jsp");
			requestDispatcher.forward(request, response);
		} else {		
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/cookies/accountDetail.jsp");
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
