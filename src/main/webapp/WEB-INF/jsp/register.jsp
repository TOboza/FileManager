<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>WebFileManager - Register</title>
</head>

<body>
<P style="text-align:center">NEW CLIENT REGISTER </P>

<form action="/userview" method="post" style="text-align:center">

    <p> USERNAME :</p>
    <input name="username" type="text" id="username" /> <br>
    <p> EMAIL ADDRESS :</p>
    <input name="email" type="text" id="email" /> <br>
    <P> PASSWORD : </P>
    <input name="password" type="password" id="password" /> <br><br>
    <P> REENTER PASSWORD : </P>
    <input name="password" type="password" id="passwordR" /> <br><br>

    <input type="submit" value="CREATE ACCOUNT" />

</form>




</body>
</html>