package CrudBean;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.servlet.Servlet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@ManagedBean
@WebServlet("/SimpleCrudBean")
public class SimpleCrudBean<Book> extends HttpServlet implements Servlet {
	private static final long serialVersionUID = 1L;
	
	private List<Book> list;
	private Book item = new Book();
	private Book beforeEditItem = null;
	private boolean edit;
@PostConstruct
	public void init() {
		list = new ArrayList<Book>();
}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
