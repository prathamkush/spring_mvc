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

    <label><b> Name :</b></label>
    <form:input path="name"/>
    <form:errors path="name" cssClass="error"/>

    <br>

    <label><b> Country :</b></label>
    <form:select path = "country">
        <form:option label = "IN" value = "INDIA"/>
        <form:option label = "CN" value = "CANADA"/>
        <form:option label = "US" value = "USA"/>
    </form:select>

    <br>

    <label><b> Rank :</b></label>
    <form:errors path="rank" cssClass="error"/>
    <form:radiobutton path="rank" label = "Grade 1" value="A"/>
    <form:radiobutton path="rank" label = "Grade 2" value="B"/>

    <br>

    <label><b> Tournaments :</b></label>
    <form:checkbox path="tournaments" label = "AUS Open" value="Australia OPEN"/>
    <form:checkbox path="tournaments" label = "US Open" value="USA OPEN"/>
    <form:checkbox path="tournaments" label = "FCH Open" value="French OPEN"/>

    <br>

    <label><b> Designation :</b></label>
    <form:input path="designation"/>
    <form:errors path="designation" cssClass="error"/>

    <br>

    <label><b> Dob : </b></label>
    <form:input path="dob"/>
    <form:errors path="dob" cssClass="error"/>

    <br>

    <label><b> Email :</b> </label>
    <form:input path="email"/>
    <form:errors path="email" cssClass="error"/>


    <input type="submit" value="Enter" />
</form:form>


</body>
</html>