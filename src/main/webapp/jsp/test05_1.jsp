<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Insert title here</title>

	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">

  	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
  	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
  	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
</head>
<body>
	
	<%
		//cm 단위 길의
		// 변환할 ㅏ단위 (체크박스 기반의 여러개)
		
		// 인치 변환 = 센치미터 * 0.39
		// 야드 변환 = 센치미터 / 91.44
		// 피트 변환 = 센치미터 / 30.48
		// 미터 변환 = 센치미터 / 100
		
		double length = Integer.parseInt(request.getParameter("length"));
		
		String[] units = request.getParameterValues("units");
		String result = "";
		for(int i = 0; i < units.length; i++) {
			String unit = units[i];
			if(unit.equals("inch")) {
				double inch = length * 0.39;
				// ex) 3.124 in
				// result = result + inch + "in";
				result += + inch + "in<br>";
			} else if(unit.equals("yard")) {
				double yard = length * 0.010936133;
				result += yard + "yd<br>";
			} else if(unit.equals("feet")) {
				double feet = length * 0.032808399;
				result += feet + "ft<br>";
			} else {
				double meter = length /100.0;
				result += meter + "m<br>";
			}
		}
		
	%>
	
		<h2>변환 결과</h2>
		<h3><%= length %>cm</h3>
		<hr>
		
		<h3><%= result %></h3>
		
		
		
			
</body>
</html>