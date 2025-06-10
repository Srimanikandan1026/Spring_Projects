<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Edit Employee</title>
</head>
<body>
    <h1>Edit Employee</h1>
    <form:form method="post" action="/editEmp/updateEmp" modelAttribute="emp">
        <form:hidden path="eid" />
        Name: <form:input path="ename" /><br><br>
        Age: <form:input path="eage" /><br><br>
        Place: <form:input path="eplace" /><br><br>
        Contact Number: <form:input path="enumber" /><br><br>

        <input type="submit" value="Update Employee">
        <input type="reset" value="Clear">
    </form:form>
    <a href="/ViewAllEmp">View All Employees</a>
</body>
</html>
