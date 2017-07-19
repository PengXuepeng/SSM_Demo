<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Test Default Servlet handler
	<form:form action="testForm" method="post" commandName="user">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="userName" /></td>
			</tr>
			<tr>
				<td>age</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>mobile</td>
				<td><form:input path="mobile" /></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><form:password path="password" showPassword="true"/></td>
			</tr>
			<tr>
				<td>Test</td>
				<td><form:textarea path="note" rows="5" cols="20"/> </td>
			</tr>
						<tr>
				<td>Test</td>
				<td><form:textarea path="note" rows="5" cols="20"/> </td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="submit" /></td>
			</tr>
		</table>

	</form:form>
</body>
</html>