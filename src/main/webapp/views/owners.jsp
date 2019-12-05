<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

 <p>Owners Details</p>
 
 <table border="1">
 <c:forEach items="${owners}" var="owner">
 
 
 <tr>
 <td><c:out value="${owner.firstName}"/></td>
  <td><c:out value="${owner.lastName}"/></td>
   <td><c:out value="${owner.email}"/></td>
    <td><c:out value="${owner.phno}"/></td>
     <td><c:out value="${owner.gender}"/></td>
      
      
 </tr>
 
 </c:forEach>


</table>

<a href="displayForm">AddOwner</a>
</body>
</html>