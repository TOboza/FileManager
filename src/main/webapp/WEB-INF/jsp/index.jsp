<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>WebFileManager - Login</title>
</head>
<body>

<header><h1 style="text-align:center">WebFileManager</h1></header>

<form action="/admview" method="post" style="text-align:center">
    <p> USERNAME :</p>
    <input name="username" type="text" id="username" /> <br>
   <P> PASSWORD : </P>
    <input name="password" type="password" id="password" /> <br><br>
    <input type="submit" value="Login!" />

</form>

<br><br>
<a href="register"> <p style="text-align: center; font-family: cursive" > Nie masz konta ? Zarejestruj się !</a></p>



</body>
</html>