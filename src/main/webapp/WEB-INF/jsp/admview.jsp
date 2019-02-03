<%@ page import="java.util.Locale" %>
<%@ page import="com.tomaszoboza.filemanager.Model.User" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="org.springframework.beans.factory.annotation.Autowired" %>
<%@ page import="com.tomaszoboza.filemanager.Model.UserRepository" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%


%>
<html>
<head>
    <title>WebFileManager - Admin view</title>
</head>
<body>
<p style="font-size: large">ADMIN VIEW</p>

<p>Manage accounts </p>
<p>Upload documents</p>
<p>Logout</p>
<%



%>

<c:forEach var = "osoby" items="s">
Item <c:out value = "${osoby}"/><p>
    </c:forEach>

</body>
</html>