<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Player Form</title>
</head>
<body>
<h1>Player Form</h1>

<%@ taglibprefix = "form" uri = "http://www.springframework.org/tags/form" %>

<form action="showPlayerDetails" method="POST">
    <label>Player form:</label>
    <input type="text" name="playerName" />
    <input type="submit" value="Enter" />

</form>

</body>
</html>