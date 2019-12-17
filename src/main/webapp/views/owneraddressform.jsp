<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1 style="color:grey;">Vehicle Owner Address Form</h1>
<form:form action="saveowneraddress" method="POST" modelAttribute="addressObj">
	<table>
	
	    <tr>
			<td>Owner ID</td>
			<td>${addressObj.ownerId}</td>
			<form:hidden path="ownerId"/>
		</tr>
		<tr>
			<td>Enter House Number</td>
			<td><form:input path="FlatNumber"/></td>
		</tr>
		<tr>
			<td>Enter Street Name</td>
			<td><form:input path="StreetName"/></td>
		</tr>
		<tr>
			<td>Select City Name</td>
			<td>
			<form:select path="CityName">
				<form:option value="">-SELECT-</form:option>
				<form:option value="Vijayawada">Vijayawada</form:option>
				<form:option value="Guntur">Guntur</form:option>
				<form:option value="Eluru">Eluru</form:option>
				<form:option value="Nuziveedu">Nuziveedu</form:option>
			</form:select>
			</td>
		</tr>
		<tr>
			<td>Enter ZipCode</td>
			<td><form:input path="ZipCode"/></td>
		</tr>
		<tr>
			<td><input type="reset" value="Previous"></td>
			<td><input type="submit" value="Next"></td>
		</tr>
		</table>
</form:form>

</body>
</html>