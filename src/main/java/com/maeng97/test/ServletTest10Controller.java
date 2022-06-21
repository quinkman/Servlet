package com.maeng97.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test10")
public class ServletTest10Controller extends HttpServlet {
	
	// doPost 메소드 바깥쪽에 위치
	private final Map<String, String> userMap =  new HashMap<String, String>() {
	    {
	        put("id", "quinkman");
	        put("password", "asdf");
	        put("name", "맹성훈");
	    }
	};
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String id = request.getParameter("id");
		String password = request.getParameter("password");
		String name = request.getParameter("name");
		
		out.println("<html><head></head><body>");
		if(userMap.get(id) != "quinkman") {
			out.println("id가 일치하지 않습니다");
		} else if(userMap.get(password) != "asdf") {
			out.println("password가 일치하지 않습니다");
		} else {
			out.println("<b>" + name + "님 환영합니다.");
		}
		out.println("</body></html>");
		
		
	}
	
}

