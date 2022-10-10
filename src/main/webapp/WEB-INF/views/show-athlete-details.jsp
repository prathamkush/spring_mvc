<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/fmt" prefix = "fmt" %>

<head>
    <title>Athlete Details</title>
</head>
<body>

<h2><i>Athlete Details Added</i></h2>

<p> <b> Name : </b>         ${athlete.name} </p>
<p> <b> Country : </b>      ${athlete.country} </p>
<p> <b> Rank : </b>         ${athlete.rank} </p>
<p> <b> Designation : </b>  ${athlete.designation} </p>
<p> <b> DOB : </b>              <fmt:formatDate value= "${athlete.dob}" type="date" pattern="dd-MM-YYYY" /> </p>
<p> <b> Email : </b>        ${athlete.email} </p>

<p>
<b> Tournaments List : </b>
    <c:forEach var="tournament_curr" items="${athlete.tournaments}">
        <li>${tournament_curr}</li>
    </c:forEach>
</p>


</body>
</html>