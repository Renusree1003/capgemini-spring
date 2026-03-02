<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>All Employee Details</title>
</head>

<body>

<h2>All Employee Details</h2>

<table border="1" cellpadding="10" cellspacing="0">

<tr>
    <th>Name</th>
    <th>Email</th>
    <th>Salary</th>
    <th>Role</th>
    <th>Action</th>
</tr>

<c:forEach var="emp" items="${msg}">
<tr>
    <td>${emp.name}</td>
    <td>${emp.email}</td>
    <td>${emp.salary}</td>
    <td>${emp.role}</td>

    <td>
        <a href="/delete?email=${emp.email}">
            Delete
        </a>
		
    </td>
	<td>
	       
		<a href="/update?email=${emp.email}">Update</a>
	   </td>
</tr>
</c:forEach>

</table>

</body>
</html>