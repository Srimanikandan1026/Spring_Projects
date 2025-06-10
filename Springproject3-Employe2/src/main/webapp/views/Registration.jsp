<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Registration Form</title>
</head>
<body>
    <h1>Employe Detials </h1>
    <form action="saveEmp" method="post">
     Name:<input type="text" name="ename"><br><br>
     Age:<input type="number" name="eage"><br><br>
     Place:<input type="text" name="eplace"><br><br>
     Contect_Nuber:<input type="text" name="enumber"><br><br>
     
     <input type="submit" value="Add Product">
     <input type="reset" value="Clear">
     </form>
     <a href="ViewAllEmp">view All Employe</a>
    
</body>
</html>