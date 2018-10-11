<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c"%>
<html>
<head>
	<title>My Spring About Demo</title>
</head>
<body>
<h1>About Us</h1>

<p><strong>Web Master: </strong><em> ${webmaster } </em></p>
<div>
<p><strong>DevTeam: </strong></p>
<ol>
<c:forEach items="${devTeam }" var="ele">
<li>${ele }</li>
</c:forEach>
</ol>
</div>
<p><strong>Admin Mail: </strong><em> ${adminMailId } </em></p>
<a href="home">Back to home</a>
</body>
</html>