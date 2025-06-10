<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>View All Employe</title>
</head>
<body>
     <h1> View All Employes</h1>
     <table border="1" width="80%"><tr>
     <th>Id</th>
     <th>Name</th>
     <th>Age</th>
     <th>Place</th>
     <th>Phone_Number</th>
     <th>Edit</th>
     <th>Delete</th>
     
     </tr>
     
      <c:forEach items="${emps}" var="emp">
     <tr>
     <td>${emp.eid}</td>
     <td>${emp.ename}</td>
     <td>${emp.eage}</td>
     <td>${emp.eplace}</td>
     <td>${emp.enumber}</td>
     <td><a href="editEmp/${emp.eid}">Edit</a></td>
     <td><a href="deleteEmp/${emp.eid }">Delete</a></td>
     </tr>
     </c:forEach>
     
     </table>

</body>
</html>