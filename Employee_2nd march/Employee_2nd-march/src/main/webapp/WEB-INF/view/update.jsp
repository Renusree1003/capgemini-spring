<html>
<head>
    <title>Update Employee</title>
</head>
<body>

<h2>Update Employee</h2>

<form action="/update-employee" method="post">

    Name: <input type="text" name="name" value="${employee.name}"><br/><br/>

    Salary: <input type="text" name="salary" value="${employee.salary}"><br/><br/>

    Role: <input type="text" name="role" value="${employee.role}"><br/><br/>

    Email: <input type="text" name="email" value="${employee.email}" readonly><br/><br/>

    Password: <input type="text" name="password" value="${employee.password}"><br/><br/>

    <input type="submit" value="Update">

</form>

</body>
</html>