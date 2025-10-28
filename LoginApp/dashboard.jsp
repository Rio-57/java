<%@ page import="javax.servlet.http.*,javax.servlet.*" %>

<%
    String user = (String) session.getAttribute("username");
    if (user == null) {
        response.sendRedirect("index.jsp?error=unauthorized");
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Dashboard</title>
</head>
<body>
    <h2>Welcome, <%= user %>!</h2>
    <p>You have successfully logged in.</p>
    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout">
    </form>
</body>
</html>