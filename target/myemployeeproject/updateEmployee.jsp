<%
    String id = request.getParameter("id");
    String name = request.getParameter("name");
    String age = request.getParameter("age");
    String dept = request.getParameter("department");
    String salary = request.getParameter("salary");
%>
<html>
<head><title>Update Employee</title></head>
<body>
<h2>Update Employee</h2>
<form method="post" action="updateEmployee">
    <input type="hidden" name="id" value="<%= id %>" />
    Name: <input type="text" name="name" value="<%= name %>" required /><br/>
    Age: <input type="number" name="age" value="<%= age %>" required /><br/>
    Department: <input type="text" name="department" value="<%= dept %>" required /><br/>
    Salary: <input type="number" step="0.01" name="salary" value="<%= salary %>" required /><br/>
    <button type="submit">Update</button>
</form>
<a href="viewEmployees">Back</a>
</body>
</html>
