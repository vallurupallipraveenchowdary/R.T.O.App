<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Owner Form</title>



  <script src="http://code.jquery.com/jquery-1.10.1.min.js"></script>
  <script src="https://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
  
  <script type="text/javascript" src="./views/js/app.js"></script>
  
  <style type="text/css">
  
  .error{
  color:red
  }
  </style>
  
   
  
  
  
</head>
<body>

<P style="color:green;">${succMsg }</P>
<P style="color:red;">${errMsg}</P>

<h2 style="color:grey;">Vehicle OwnerForm </h2>
<form:form action="saveowner" method="POST" modelAttribute="ownerObj" id="OwnerForm">

<table>
  

  <tr>
      <td> FirstName:</td>
      <td><form:input id="firstName" path="firstName"/></td>
  </tr>
  
  <tr>
      <td> Last Name:</td>
      <td><form:input id="lastName" path="lastName"/></td>
  </tr>
  
  
  
  <tr>
      <td> Email:</td>
      <td><form:input id="email" path="email"/></td>
  </tr>
  
  <tr>
      <td> PhNo:</td>
      <td><form:input id="phno" path="phno"/></td>
  </tr>
  
  <tr>
      <td> Gender:</td>
      <td>
      <form:radiobutton  path="gender" value="male"/>Male
      <form:radiobutton  path="gender" value="female"/>Fe-Male
      
      </td>
  </tr>
  
   
  
  
  
  <tr>
     <td><input type="reset" value="Reset"/></td>
      <td><input type="submit" value="Submit"/></td>
  </tr>


</table>


</form:form>

<!-- <a href="viewowners">view Owners</a> -->

</body>
</html>