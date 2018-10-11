<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<html>
<head>
<title>Book Page</title>
</head>
<body>
	<h1>Book Form</h1>

	<form:form action="book" modelAttribute="book" method="POST">

		<div>
			<form:label path="bcode">Enter your Book Code:</form:label>
			<form:input path="bcode" type="number" />
		</div>

		<div>
			<form:label path="title">Enter your Book Title:</form:label>
			<form:input path="title" type="text" />
		</div>
		<div>
			<form:label path="price">Enter the Book Price:</form:label>
			<form:input path="price" type="number" />
		</div>
		<div>
			<form:label path="category">Enter your Book Category:</form:label>
			<form:select path="category">
				<form:option value="">----SELECT----</form:option>
				<form:options items="${posibCatgs }" />
			</form:select>
		</div>
		<div>
			<form:label path="type">Enter your Book Type:</form:label>
			<form:radiobuttons path="type" items="${posibTypes }" />
		</div>

		<div>
			<form:button type="submit">Save</form:button>
		</div>

	</form:form>
</body>
</html>