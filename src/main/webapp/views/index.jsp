<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User Form</title>
</head>
<body>
<h2>UserForm </h2>

<P>${succMsg }</P>
<P>${errMsg}</P>
<form:form action="saveUser" method="POST" modelAttribute="userObj">

<table>
  

  <tr>
      <td> FirstName:</td>
      <td><form:input path="firstName"/></td>
  </tr>
  
  <tr>
      <td> Last Name:</td>
      <td><form:input path="lastName"/></td>
  </tr>
  
  
  
  <tr>
      <td> Email:</td>
      <td><form:input path="email"/></td>
  </tr>
  
  <tr>
      <td> PhNo:</td>
      <td><form:input path="phno"/></td>
  </tr>
  
  <tr>
      <td> Gender:</td>
      <td>
      <form:radiobutton path="gender" value="male"/>Male
      <form:radiobutton path="gender" value="female"/>Fe-Male
      
      </td>
  </tr>
  
   
  
  
  
  <tr>
     
      <td><input type="submit" value="Submit"/></td>
  </tr>


</table>


</form:form>

<a href="viewUsers">view Users</a>

</body>
</html>