package com.maeng97.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test09")
public class ServletTest09Controller extends HttpServlet {
	
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String apply = request.getParameter("apply");
		
		out.println("<html><head><title>지원</title></head> <body>");
		out.println("<h1>" + name + "님 지원이 완료되었습니다</h1> <hr>");
		out.println("지원내용 <br>" + apply);
		out.println("</body> </html>");
		
		
	}

}
