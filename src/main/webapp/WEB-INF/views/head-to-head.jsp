<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>

<html>
<head>
    <style>
        .error{
            color: red;
            font-style: italic;
        }
    </style>
    <title>Head to Head Form</title>
</head>
<body>

<h2><i>Player Head to Head Stats</i></h2>
<form:form action="showHeadToHeadStats" modelAttribute="playerStats">

    <label><b> Player1 :</b></label>
    <form:input path="player1"/>
    <form:errors path="player1" cssClass="error"/>

    <br>

    <label><b> Player2 :</b></label>
    <form:input path="player2"/>
    <form:errors path="player2" cssClass="error"/>

    <br>

    <label><b> Player3 :</b></label>
    <form:input path="player3"/>
    <form:errors path="player3" cssClass="error"/>

    <br>

    <label><b> headToHead :</b></label>
    <form:input path="headToHead"/>
    <form:errors path="headToHead" cssClass="error"/>

    <input type="submit" value="Enter" />
</form:form>


</body>
</html>