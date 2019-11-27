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
<for:form action="deleting" modelAttribute="pizzaorder" method="post">
<table>

<tr>
<td><for:label path="orderId">orderId</for:label></td>
<td><for:input path="orderId"  readonly="true"></for:input></td>
</tr>
<%-- <tr>
<td><for:label path="Cd">custId</for:label></td>
<td><for:input path="Cd"  readonly="true"></for:input></td>
</tr> --%>
<tr>
<td><for:label path="totalPrice" >price</for:label></td>
<td><for:input path="totalPrice"   readonly="true"></for:input></td>
</tr>
<tr>
<td>
<input type="submit" value="submit to delete">
</td>
</tr>
</table> 
</for:form>
</body>
</html>