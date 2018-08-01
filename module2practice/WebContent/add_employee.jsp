<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
		<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<f:form action="addemployee" method="post" modelAttribute="emp">
		<f:input path="id" /><br>
		<f:errors path="id"></f:errors>
		<f:input path="name" /><br>
		<f:errors path="name"></f:errors>
		<f:input path="duration" /><br>
		<f:input path="faculty" /><br>
		<f:input path="model" /><br>
		<input type="submit" value="Add" />
	</f:form>
</body>
</html>