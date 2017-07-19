<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>

<body>
	Welcome
	
	<br />
	<br /> Request user: ${requestScope.user }
	<br />
	<br /> Session user: ${sessionScope.user }
	<br />
		<br />
	<br /> Request name: ${requestScope.name }
	<br />
	<br /> Session name: ${sessionScope.name }
	<br /> Request time: ${requestScope.Time }
	<br />
	<br /> Session time: ${sessionScope.Time }
	<br />
	<br /> Request User: ${requestScope.user }
	<br />
	<br /> Session User: ${sessionScope.user }
	<br />
	<br />
	<br />
	<br /> names: ${requestScope.names }
	
	<br/><br/>
	<fmt:message key="username"></fmt:message><br>
	<fmt:message key="password"></fmt:message>
</body>
</html>