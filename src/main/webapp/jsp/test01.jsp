<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="java.util.Arrays" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<%-- 1번 문제 --%>
	<%
		int[] scores = {80, 90, 100, 95, 80};
	
		int sum = 0;
		for(int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		double average = sum / (double)scores.length;
	%>
	<h3>scores 평균 : <%= average %></h3>
	
	<%-- 2번 문제 --%>
	<%
		List<String> scoreList = Arrays.asList(new String[]{"X", "O", "O", "O", "X", "O", "O", "O", "X", "O"});
		
		int score = 0;
		for(String answer : scoreList) {
					
			if(answer.equals("O")) {
				score += 10;
			}
			
		}
	%>
	<h3>채점 결과는 <%= score %> 점 입니다.</h3>
	
	<%-- 3번 문제 --%>
	
	<%!
		public int sum(int number) {
			int sum = 0;
			for(int i = 1; i <= number; i++) {
				sum += i;
			}
			return sum;
		}
	%>
	
	
	<h3>1부터 50까지의 합은 <%= sum(50)  %></h3>
	
	
	<%-- 4번 문제 --%>
	<%
		String birthDay = "20010820";
	
		String yearString = birthDay.substring(0, 4);
		
		int year = Integer.parseInt(yearString);
		
		int age = 2022 - year + 1;
	%>
	<h3>20010820 의 나이는 <%= age %>살 입니다.</h3>
	
	
	
	
	
</body>
</html>