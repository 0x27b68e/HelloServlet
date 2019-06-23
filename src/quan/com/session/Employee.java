package quan.com.session;

import javax.servlet.http.HttpSessionActivationListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;
import javax.servlet.http.HttpSessionEvent;

public class Employee implements HttpSessionBindingListener, HttpSessionActivationListener{
	
	private String name;

	public Employee(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void valueBound(HttpSessionBindingEvent event) {
		event.getSession().getServletContext().log("Employee in Session");
	}

	@Override
	public void valueUnbound(HttpSessionBindingEvent event) {
		event.getSession().getServletContext().log("Employee out Session");
	}

	@Override
	public void sessionDidActivate(HttpSessionEvent se) {
		se.getSession().getServletContext().log("Employee in sessionDidActivate");
	}

	@Override
	public void sessionWillPassivate(HttpSessionEvent se) {
		se.getSession().getServletContext().log("Employee out sessionDidActivate");
	}

}
