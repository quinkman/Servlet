package com.maeng97.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test06")
public class ServletTest06Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("application/json");
		response.setCharacterEncoding("utf-8");
		
		PrintWriter out = response.getWriter();
		
		String stringNumber1 = request.getParameter("number1");
		String stringNumber2 = request.getParameter("number2");
		
		int number1 = Integer.parseInt(stringNumber1);
		int number2 = Integer.parseInt(stringNumber2);
		
		out.println("{\"addtion\":\"" + (number1 + number2) + "\", \"subtraction\":\"" + (number1 - number2) + "\", \"multiplication\":\"" + (number1 * number2) + "\", \"division\":\"" + (number1 / number2) + "\"}");
		
	}

}
