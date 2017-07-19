<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<!-- <script src="http://code.jquery.com/jquery-1.11.1.min.js"> -->
	<script type="text/javascript" src="js/jquery-1.11.0.min.js"></script>

<script type="text/javascript" src="js/json2.js"></script>
<script type="text/javascript">
	$(document).ready(function() {
		alert(11);
		testRequestBody();
	});
	function testRequestBody() {
		alert("${pageContext.request.contextPath}");
		alert(22);
		$.ajax({
			dataType : "json",
			type : "post",
			url : "${pageContext.request.contextPath}/json/testRequestBody",

			contentType : "application/json",
			data : JSON.stringify({id:1,name:"SPRING MVC"}),
			async : true,
			success : function(data) {
				alert(33);
	
							
							 console.log(data);
							  $("#id").html(data.id);
							  $("#name").html(data.name);
							  $("#author").html(data.author);
			},
			error : function() {
				alert(44);
			}
		});
	};
// function TestJson(){
// 	$.ajax({
// 		url:'${pageContext.request.contextPath}/json/testJson',
// 		contentType:'application/json;charset=utf-8',
// 		data:'{"userName":"Dylan";"password":"pwdDylan"}',
// 		success:function(data){
// 			alert(data.username);
// 		}
// 	});
// }
</script>
</head>
<body>

<input type="button" value="json" onclick="TestJson()"> 

	Num:
	<span id="id"></span>
	<br> Name:
	<span id="name"></span>
	<br /> Author:
	<span id="author"></span>
	<br>
</body>
</html>