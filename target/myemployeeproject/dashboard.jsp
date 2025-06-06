<%@ page import="java.util.*, model.Employee" %>
<%
    HttpSession session = request.getSession(false);
    if (session == null || session.getAttribute("user") == null) {
        response.sendRedirect("index.jsp");
    }

    List<Employee> employees = (List<Employee>) request.getAttribute("employees");
%>
<html>
<head><title>Dashboard</title></head>
<body>
<h2>Welcome, <%= session.getAttribute("user") %></h2>
<a href="addEmployee.jsp">Add Employee</a> | 
<a href="logout">Logout</a>
<br><br>
<table border="1">
<tr><th>ID</th><th>Name</th><th>Age</th><th>Department</th><th>Salary</th><th>Actions</th></tr>
<%
for (Employee emp : employees) {
%>
<tr>
    <td><%= emp.getId() %></td>
    <td><%= emp.getName() %></td>
    <td><%= emp.getAge() %></td>
    <td><%= emp.getDepartment() %></td>
    <td><%= emp.getSalary() %></td>
    <td>
        <form method="post" action="updateEmployee.jsp">
            <input type="hidden" name="id" value="<%= emp.getId() %>"/>
            <input type="hidden" name="name" value="<%= emp.getName() %>"/>
            <input type="hidden" name="age" value="<%= emp.getAge() %>"/>
            <input type="hidden" name="department" value="<%= emp.getDepartment() %>"/>
            <input type="hidden" name="salary" value="<%= emp.getSalary() %>"/>
            <input type="submit" value="Edit"/>
        </form>
        <a href="deleteEmployee?id=<%= emp.getId() %>">Delete</a>
    </td>
</tr>
<% } %>
</table>
</body>
</html>
