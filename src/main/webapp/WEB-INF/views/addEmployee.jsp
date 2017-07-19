<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<form:form action="addEmployee" method="POST" modelAttribute="employee">
name:<form:input path="name" />

gender:<form:radiobuttons path="gender" items="${genders }" /><br/>
Address:<form:select path="address" items="${address }"
			itemLabel="province" itemValue="id"></form:select><br>
			<input type="submit" value="Add">
	</form:form>
</body>
</html>