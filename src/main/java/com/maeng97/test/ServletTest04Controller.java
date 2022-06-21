package com.maeng97.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test04")
public class ServletTest04Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		
		out.println("<html> <head> 리스트 출력 </head>");
		out.println("<body> <ul>");
		
		for(int i = 1; i < 31; i++) {
			
			out.println("<li>" + i + "번째 리스트 </li>" );
		}
		
		out.println("</ul> </body> </html>");
		
	}

}
