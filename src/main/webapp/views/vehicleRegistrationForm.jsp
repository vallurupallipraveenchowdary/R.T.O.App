<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1 style="color:blue">Before register your details once check your details </h1>
	<h2 style="color:greay">Owner Details</h2>
	<table>
		<tr>
			<td>OwnerFirstName :</td>
			<td>${ownerObj.firstName}</td>
		</tr>
		<tr>
			<td>OwnerLastName :</td>
			<td>${ownerObj.lastName}</td>
		</tr>
		<tr>
			<td>Email :</td>
			<td>${ownerObj.email}</td>
		</tr>
		<tr>
			<td>MobileNo :</td>
			<td>${ownerObj.phno}</td>
		</tr>
		
		<tr>
			<td>Gender :</td>
			<td>${ownerObj.gender}</td>
		</tr>
	</table>
	
	
	<h2 style="color:green">Owner Address</h2>
	<table>
		<tr>
			<td>Enter House Number :</td>
			<td>${addressObj.flatNumber}</td>
		</tr>
		<tr>
			<td>Enter Street Name :</td>
			<td>${addressObj.streetName}</td>
		</tr>
		<tr>
			<td>Select City Name :</td>
			<td>${addressObj.cityName}</td>
		</tr>
		<tr>
			<td>Enter ZipCode :</td>
			<td>${addressObj.zipCode}</td>
		</tr>
		</table>
	
	
	<h2 style="color:orange">Vehicle Details</h2>
	
	<table>
	    <tr>
			<td>Enter Vehicle Type :</td>
			<td>${vehicledetailsObj.selectVehicle}</td>
		</tr>
		<tr>
			<td>Enter Company name :</td>
			<td>${vehicledetailsObj.vehicleCompany}</td>
		</tr>
		<tr>
			<td>Enter Manufacturing Year :</td>
			<td>${vehicledetailsObj.manufacturingYear}</td>
		</tr>
		<tr>
			<td>Enter Vehicle color :</td>
			<td>${vehicledetailsObj.vehicleColor}</td>
		</tr>
		</table>
		
		
		
		
		
	 <form:form action="saveVehicleRegistrationDetails" method="POST" modelAttribute="vehicleRegObj">
		<table>
			<tr>
				<td>Owner ID</td>
				<td>${vehicleRegObj.ownerId}</td>
				<form:hidden path="ownerId" />
			</tr>
			<tr>
				<td><input type="submit" value="Register"></td>
			</tr>
		</table>
	</form:form> 

</body>
</html>