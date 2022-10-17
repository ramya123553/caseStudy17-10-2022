<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3 style="color: blue;">
			<form action="bill" method="get">
			Enter Mobile Number: <input type="text" name="mobileNum"/>
			<br> <br>
			Select plan from below
			<table border="2">
					<tr style="background-color:orange; color: blue;">
						<th style="padding: 5px;">PLAN ID</th>
						<th style="padding: 5px;">DAYS</th>
						<th style="padding: 5px;">TALKTIME</th>
						<th style="padding: 5px;">DATA</th>
						<th style="padding: 5px;">PRICE</th>
						<th style="padding: 5px;">SELECT</th>
					</tr>
					<c:forEach items="${offerList}" var="offer">
						<tr style="background-color: yellow; color: blue;">
							<td style="padding: 10px;">${offer.id}</td>
							<td style="padding: 10px;">${offer.days}</td>
							<td style="padding: 10px;">${offer.talkTime}</td>
							<td style="padding: 10px;">${offer.data}</td>
							<td style="padding: 10px;">${offer.price}</td>
							<td style="padding: 10px;"> <input type="radio" value="${offer.id}" name="radio"/> </td>
						</tr>
					</c:forEach>
				</table>
				<br>
				<input type="submit" value="submit">
			</form>
		</h3>
	</div>
</body>
</html>