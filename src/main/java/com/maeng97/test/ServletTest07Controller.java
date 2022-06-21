package com.maeng97.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/servlet/test07")
public class ServletTest07Controller extends HttpServlet {
	
	
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
	
	response.setCharacterEncoding("utf-8");
	response.setContentType("text/html");
	
	PrintWriter out = response.getWriter();

	String address = request.getParameter("address");
	String priceString = request.getParameter("price");
	String card = request.getParameter("card");
	
	
	out.println("<html> <head><title>배달의 민족</title></head><body>");
	
	if(!address.contains("서울시")) {
		out.println("배달 불가 지역입니다 <hr>");
		
	} else if(card == "신한카드") {
	
		out.println(" 결제불가카드입니다");
	} else {
		out.println(address + "로 배달 중 <hr>");
		out.println("결제 금액 : " + priceString );
	}
	
	out.println("</body></html>");
	
	
	
	
	}
}
