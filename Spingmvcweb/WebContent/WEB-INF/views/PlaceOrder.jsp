<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="for" %>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style >
.error{color:orange}
</style>
</head>
<body bgcolor="greece">
<for:errors path="cust.*" cssClass="error"></for:errors>
<for:form action="PlaceController" modelAttribute="cust" method="get">
<for:label path="custName">CustomerName:</for:label>
<for:input path="custName"></for:input><br>
<for:label path="address">Address:</for:label>
<for:input path="address"></for:input><br>
<for:label path="phone">Phone:</for:label>
<for:input path="phone"></for:input><br>
<select name="pizza">

<c:forEach var="s" items="${pizzatoppings}">
<option value="${s.value}">${s.key}</option>
</c:forEach>
</select><br>
<input type="submit" value="submit to add">
</for:form>
<img src="C:\springHtml\Spingmvcweb\WebContent\image\download.jpg" height="300" width="300"><img src="C:\springHtml\Spingmvcweb\WebContent\image\img2.jpg" height="300" width="300">
</body>
</html>
         