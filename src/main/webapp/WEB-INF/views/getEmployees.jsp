<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 tdansitional//EN" "http://www.w3.org/td/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	Hello

	<c:if test="${empty requestScope.employees }">
	No data
	</c:if>
	<c:if test="${!empty requestScope.employees }">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<td>ID</td>
				<td>name</td>
				<td>gender</td>
				<td>province</td>
				<td>city</td>
				<td>operation</td>
			</tr>
			<c:forEach items="${requestScope.employees }" var="emp">
				<tr>
					<td>${emp.id }</td>
					<td>${emp.name }</td>
					<td>${emp.gender == 0 ? 'Female':'Male' }</td>
					<td>${emp.address.province }</td>
					<td>${emp.address.city }</td>
					<td><a href="">Edit</a> <a href="">Delete</a></td>
				</tr>

			</c:forEach>
		</table>
	</c:if>
	<a href="addEmployee">Add Employee</a>
</body>
</html>