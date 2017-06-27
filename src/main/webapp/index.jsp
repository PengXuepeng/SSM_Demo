<html>
<body>
	<h2>Hello World!</h2>

	<form action="role/addRole">

		<input type="submit">

	</form>
	<a href="role/getRolebyId?id=1">get Role</a> Dylan
	<form action="springmvc/testPostMethod" method="post">
		<input type="submit" value="login">
	</form>
	<a href="springmvc/testGetMethod">Test Get Method</a>
	<a href="springmvc/testPathVariable/123">Test PathVariable</a>

	<!-- Test REST: GET POST PUT DELETE -->
	<form action="springmvc/testPUTMethod/123" method="post">
		<input type="hidden" name="_method" value="PUT" /> <input
			type="submit" value="Test PUT">
	</form>

	<form action="springmvc/testdeleteMethod/123" method="post">
		<input type="hidden" name="_method" value="DELETE" /> <input
			type="submit" value="Test DELETE">
	</form>

	<!-- Test Request Param -->
	<a href="springmvc/testRequestParam?username=Dylan&age=25">Test
		equest Param</a>

	<form action="springmvc/testRequestParambyForm" method="post">
		username:<input type="text" name="username" /> age:<input type="text"
			name="age" /> <input type="submit" value="testRequestParambyForm" />
	</form>
	<!-- Error -->
	<form action="springmvc/testRequestParambyForm2" method="post">
		username:<input type="text" name="username" /> age:<input type="text"
			name="age" /> city:<input type="text" name="address.city" /> <input
			type="submit" value="testRequestParambyForm" />
	</form>

	<a href="springmvc/testCookie">Test Cookie</a>

	<a href="springmvc/testServletAPI"> Test Servlet API</a>
	<a href="springmvc/testModelAndView"> Test ModelAndView</a>
	<a href="springmvc/testMap"> Test Map</a>
	<a href="springmvc/testModel"> Test Model</a>
</body>
</html>
