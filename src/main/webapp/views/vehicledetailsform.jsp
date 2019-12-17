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

<h2 style="color:grey;">Vehicle Details Form</h2>

<form:form action="savevehicleDetails" method="POST" modelAttribute="vehicledetailsObj">
	<table>
	
	<tr>
				<td>Owner ID</td>
				<td>${vehicledetailsObj.ownerId}</td>
				<form:hidden path="ownerId"/>
			</tr>
	<tr>
			<td>Enter Vehicle Type</td>
			<td>
			<form:select path="SelectVehicle">
				<form:option value="">-SELECT-</form:option>
				<form:option value="2-wheeler">2-wheeler</form:option>
				<form:option value="4-wheeler">4-wheeler</form:option>
				<form:option value="6-wheeler">6-wheeler</form:option>
			</form:select>
			</td>
		</tr>
		<tr>
			<td>Enter Company name</td>
			<td><form:input path="VehicleCompany"/></td>
		</tr>
		<tr>
			<td>Enter Manufacturing Year</td>
			<td>
			<form:select path="ManufacturingYear">
				<form:option value="">-SELECT-</form:option>
				<form:option value="2019">2019</form:option>
				<form:option value="2018">2018</form:option>
				<form:option value="2017">2017</form:option>
			</form:select>
			</td>
		</tr>
	
		<tr>
			<td>Enter Vehicle color</td>
			<td><form:input path="VehicleColor"/></td>
		</tr>
		<tr>
			<td><input type="reset" value="Previous"></td>
			<td><input type="submit" value="Next"></td>
		</tr>
		</table>
</form:form>

</body>
</html>