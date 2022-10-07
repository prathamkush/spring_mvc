<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="ISO-8859-1" %>

<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>


<head>
    <title>Athlete Details</title>
</head>
<body>

<h2><i>Athlete Details Added</i></h2>

<p> Name : ${athlete.name} </p>
<p> Country : ${athlete.country} </p>
<p> Rank : ${athlete.rank} </p>


<p>
    Tournaments List:
    <c:forEach var="tournament_curr" items="${athlete.tournaments}">
        <li>${tournament_curr}</li>
    </c:forEach>
</p>


</body>
</html>