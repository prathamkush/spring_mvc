<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix = "form" uri = "http://www.springframework.org/tags/form" %>


<head>
    <style>
        .error{
            color: red;
            font-style: italic;
        }
    </style>
    <title>Athlete Form</title>
</head>
<body>

<h2><i>Athlete form</i></h2>
<form:form action="showAthleteDetails" modelAttribute="athlete">
<label>Name</label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>
    <form:select path = "country">
        <form:option label = "IN" value = "INDIA"/>
        <form:option label = "CN" value = "CANADA"/>
        <form:option label = "US" value = "USA"/>
    </form:select>

    <form:radiobutton path="rank" label = "Grade 1" value="A"/>
    <form:radiobutton path="rank" label = "Grade 2" value="B"/>
    <br>
    <form:checkbox path="tournaments" label = "AUS Open" value="Australia OPEN"/>
    <form:checkbox path="tournaments" label = "US Open" value="USA OPEN"/>
    <form:checkbox path="tournaments" label = "FCH Open" value="French OPEN"/>

    <input type="submit" value="Enter" />
</form:form>


</body>
</html>