<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib prefix="a" uri="http://java.sun.com/jsp/jstl/core" %>   
<%@taglib prefix="c" uri="http://www.springframework.org/tags/form" %> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Scheduled Sessions</title>
</head>
<body>
<table>
<tr>
<th>ID</th>
<th>Name</th>
<th>duration</th>
<th>faculty</th>
<th>Mode</th>
</tr>

<a:forEach items="${sessiondata}" var="obj">
<tr>
<td>${obj.id}</td>
<td>${obj.name}</td>
<td>${obj.duration}</td>
<td>${obj.faculty}</td>
<td>${obj.mode1}</td>
<!-- <td><input type="submit" value="Update"></td> -->
<td><a href="update/${obj.id}">Update</a><td>
</tr>
</a:forEach>
</table>
</body>
</html>