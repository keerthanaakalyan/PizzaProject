<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="for" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<for:form action="addcontact" modelAttribute="contact" method="get">
<table>
<tr>
<td><for:label path="fname">FirstName</for:label></td>
<td><for:input path="fname"></for:input></td>
</tr>
<tr>
<td><for:label path="lname">LastName</for:label></td>
<td><for:input path="lname"></for:input></td>
</tr>
<tr>
<td><for:label path="telephone">Phone</for:label></td>
<td><for:input path="telephone"></for:input></td>
</tr>
<tr>
<td><for:label path="email">Email</for:label></td>
<td><for:input path="email"></for:input></td>
</tr>
<tr>
<td><for:label path="gender">Gender</for:label></td>
<td>Male<for:radiobutton path="gender" value="male"/></td>
<td>Female<for:radiobutton path="gender" value="female"/></td>
</tr>
<tr>
<td><for:label path="property">Property</for:label></td><td>
House<for:checkbox path="property" value="House"/>
Car<for:checkbox path="property" value="Car"/>
Land<for:checkbox path="property" value="Land"/>
Bike<for:checkbox path="property" value="bike"/></td>
</tr>
<tr><td>
 city:
<td><for:select path="city">
<for:option value="chennai">Chennai</for:option>
<for:option value="Mumbai" label="Mumbai"/>
<for:option value="Delhi" label="Delhi"/>
</for:select>
</td>
</tr>
<tr>
<td>
<input type="submit" value="submit to add">
</td>
</tr>
</table> 
</for:form>
</body>
</html>