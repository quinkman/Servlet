package com.maeng97.servlet.ex;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/serlvet/ex05")
public class Servlet05Controller extends HttpServlet {
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/html");
		
		PrintWriter out = response.getWriter();
		
		// 이름 생년월일 전달 받고 이름과 나이를 출력
		// name, birthday
		String name = request.getParameter("name");
		String birthday = request.getParameter("birthday");
				
		// 19990423
		String yearString = birthday.substring(0, 4);
		int year = Integer.parseInt(yearString);
				
		int age = 2022 - year + 1;
		
		out.println("<html> <head> <title> post method </title> </head> <body>");
		out.println("<h1>이름 : " + name + " </h1>");
		out.println("<h3> 나이 : " + age + "</h3>" );
		out.println("</body> </html>");
	}

}
