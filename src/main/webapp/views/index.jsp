<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>
 	<h1>Welcome, Sharad</h1>

<%--
 	<form action="add">
 	    Num1: <input type="text" name="num1"/> <br> <br>
 	    Num2: <input type="text" name="num2"/> <br> <br>
 	    <input type="submit" value="Submit"/>
 	</form>
--%>

    <form action="addAlien" method="post">
 	    ID: <input type="text" name="aid"/> <br> <br>
 	    Name: <input type="text" name="aname"/> <br> <br>
 	    <input type="submit" value="Submit"/>
 	</form>

 	<br><hr><br>

 	<form action="getAlien" method="post">
        ID: <input type="text" name="aid"/> <br> <br>
        <input type="submit" value="Submit"/>
    </form>

 	<br><hr><br>

 	<form action="getAlienByName" method="post">
        Name: <input type="text" name="aname"/> <br> <br>
        <input type="submit" value="Submit"/>
    </form>

 	<h2> answer is ${answer} </h2>
</body>
</html>