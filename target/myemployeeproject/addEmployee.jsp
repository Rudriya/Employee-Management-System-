<html>
<head><title>Add Employee</title></head>
<body>
<h2>Add New Employee</h2>
<form method="post" action="addEmployee">
    Name: <input type="text" name="name" required /><br/>
    Age: <input type="number" name="age" required /><br/>
    Department: <input type="text" name="department" required /><br/>
    Salary: <input type="number" step="0.01" name="salary" required /><br/>
    <button type="submit">Add</button>
</form>
<br>
<a href="viewEmployees">Back</a>
</body>
</html>
