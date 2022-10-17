<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2 style="color: green;">Bill for Recharge on mobile number: ${mobileNum}</h2>
		<h3 style="color: red;">
			Transaction Id: ${transactionId}
			<br> <br>
			Offer Id: ${resOffer.id }
			<br> <br>
			Valid for: ${resOffer.days } days
			<br> <br>
			Talk Time Amount: ${resOffer.talkTime }
			<br> <br>
			Data Balance: ${resOffer.data } GB
			<br> <br>
			Amount Payable: ${resOffer.price }
			<br> <br>
		</h3>
		<h4><a href="index">return</a></h4>
	</div>
</body>
</html>