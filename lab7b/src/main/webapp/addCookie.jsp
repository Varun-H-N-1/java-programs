<%@ page language="java" %>
<%@ page import="javax.servlet.http.Cookie" %>

<html>
<head>
    <title>Cookie Added</title>
</head>
<body>

<%
    String name = request.getParameter("name");
    String ageStr = request.getParameter("age");

    int age = 0;
    if(ageStr != null && !ageStr.isEmpty()) {
        age = Integer.parseInt(ageStr);
    }

    // Create cookie (name=value same)
    Cookie cookie = new Cookie(name, name);

    // Set expiry time
    cookie.setMaxAge(age);

    // Add cookie to response
    response.addCookie(cookie);
%>

<h2>Cookie Added Successfully!</h2>

<p><b>Name:</b> <%= name %></p>
<p><b>Max Age:</b> <%= age %> seconds</p>

<br>
<a href="showCookies.jsp">Go to Active Cookie List</a>

</body>
</html>