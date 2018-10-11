<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
<title>Salary Form</title>
</head>
<body>
	<form:form action="salary" method="POST" modelAttribute="emp">
		<div>
			<form:label path="empId">Enter your Employee ID:</form:label>
			<form:input path="empId" type="number" />
		</div>

		<div>
			<form:label path="name">Enter Name:</form:label>
			<form:input path="name" type="text" />
		</div>
		
		<div>
			<form:label path="basic">Enter the Employee Basic</form:label>
			<form:input path="basic" type="number" />
		</div>
		
		<div>
			<form:label path="experience">Enter the Employee Experience</form:label>
			<form:input path="experience" type="number" />
		</div>
		
		<div>
			<form:label path="department">Select your department </form:label>
			<form:select path="department">
				<form:option value="">----SELECT----</form:option>
				<form:options items="${posibDept }" />
			</form:select>
		</div>
		
		<div>
			<form:label path="gender">Select Your Gender:</form:label>
			<form:radiobuttons path="gender" items="${posibGender }" />
		</div>
		
		<br />
		<button>Submit</button>
	</form:form>
	<a href="home">HomePage</a>
</body>
</html>