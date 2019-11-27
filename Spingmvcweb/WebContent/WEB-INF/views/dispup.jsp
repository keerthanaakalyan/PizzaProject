<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="for" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="greece">
<for:form action="upemp" modelAttribute="cust" method="get">
<table>
<tr>
<td><for:label path="custId">custId</for:label></td>
<td><for:input path="custId"></for:input></td>
</tr>
<tr>
<td><for:label path="custName">custName</for:label></td>
<td><for:input path="custName" ></for:input></td>
</tr>
<tr>
<td><for:label path="address">address</for:label></td>
<td><for:input path="address" ></for:input></td>
</tr>
<tr>
<tr>
<td><for:label path="phone">Phone</for:label></td>
<td><for:input path="phone" ></for:input></td>
</tr>
<%-- <tr>
<td><for:label path="orderId">OrderId</for:label></td>
<td><for:input path="orderId"></for:input></td>
</tr>
<tr>
<td><for:label path="totalPrice">Name</for:label></td>
<td><for:input path="totalPrice"></for:input></td>
</tr> --%>

<tr>
<td>
<input type="submit" value="submit to Update">
</td>
</tr>
</table> 
<img src="C:\springHtml\Spingmvcweb\WebContent\image\download.jpg" height="300" width="300"><img src="/image/img2.jpg" height="300" width="300">
</for:form>
</body>
</html>