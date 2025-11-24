package com.advanced;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Test
 */
@WebServlet
public class Test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Test() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String param = request.getParameter("page");
		if(param != null) {
			if(param.equalsIgnoreCase("login")) {
				getServletContext().getRequestDispatcher("/login.jsp").forward(request, response);
				response.getWriter().append("Served at : ").append(param);
			}else if(param.equalsIgnoreCase("signup")) {
				request.getRequestDispatcher("signup.jsp").forward(request, response);
			}else if(param.equalsIgnoreCase("about")) {
				request.getRequestDispatcher("about.jsp").forward(request, response);
			}else {
				request.getRequestDispatcher("notfound.jsp").forward(request, response);
			}
		}
	}

}
