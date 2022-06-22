<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<h2>jsp 기초</h2>
	
	<%-- jsp 주석 소스보기를 통해서 볼 수 없다 --%>
	
	<%-- 1부터 100까지 합 구하고 결과 보여주기 --%>
	<%
		int sum = 0;
		for(int i = 1; i <= 100; i++){
			sum += i;
		}
		
		// 자바 코드로 출력하기(별로 좋지않음)
		// out.println("<h3>" + sum + "</h3>");
	%>
	
	<h3> 합게 : <%= sum %></h3>
	
	<%-- 리스트 사용하기 --%>
	<%
		// 동물 이름 리스트
		List<String> animalList = new ArrayList<>();
		
		animalList.add("dog");
		animalList.add("cat");
		animalList.add("tiger");
	
	%>
	
	<h4><%= animalList.get(0) %></h4>
	
	<input type="text" value="<%= animalList.get(2) %>">
	
	<%!
		public String getHelloWorld() {
			return "hello world";
		}
	
	%>
	<%= getHelloWorld() %>
	
	
	
</body>
</html>