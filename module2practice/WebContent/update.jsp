<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:form action="/ScheduledManagementSystem_152642/update1" method="post" modelAttribute="up">
<table>

<tr>
<td>ID</td>
<td><input type="text" name="id" value="${modelupdate.id}" readonly/></td>
</tr>

<tr>
<td>Name</td>
<td><input type="text" name="name" value="${modelupdate.name}"/></td>
<td><c:errors path="name"></c:errors>
</tr>


<tr>
<td>Duration</td>
<td><input type="text" name="duration" value="${modelupdate.duration}"/></td>
<td><c:errors path="duration"></c:errors>
</tr>


<tr>
<td>Faculty</td>
<td><input type="text" name="faculty" value="${modelupdate.faculty}"/></td>
<td><c:errors path="faculty"></c:errors>
</tr>


<tr>
<td>Mode</td>
<td><input type="text" name="mode" value="${modelupdate.mode1}"/></td>
<td><c:errors path="faculty"></c:errors>
</tr>

<tr>
<td><a href="/Success"><input type="submit" value="Update"></td>
</tr>
</table>

</c:form>
</body>
</html>