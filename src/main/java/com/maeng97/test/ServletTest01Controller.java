package com.maeng97.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ServletTest01Controller extends HttpServlet {
	
	@Override
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		response.setContentType("text/plain");
		
		response.setCharacterEncoding("utf-8");
		
		Date today = new Date();
		
		
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy년 M월 d일");
		String dateString = formatter.format(today);
		
		PrintWriter out = response.getWriter();
		out.println("오늘의 날짜는 " + today);
		
		
	}
	
}
