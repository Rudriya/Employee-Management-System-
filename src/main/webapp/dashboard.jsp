<%@ page import="java.util.*, model.Employee" %>
<%
    if (session == null || session.getAttribute("user") == null) {
        response.sendRedirect("index.jsp");
    }

    List<Employee> employees = (List<Employee>) request.getAttribute("employees");
%>
<html>
<head>
    <title>Employee Dashboard</title>
    <style>
        body {
            font-family: 'Segoe UI', sans-serif;
            background-color: #f2f6fc;
            padding: 30px;
        }

        .header {
            display: flex;
            justify-content: space-between;
            align-items: center;
        }

        .header h2 {
            margin: 0;
        }

        .nav-links {
            margin-top: 10px;
        }

        .nav-links a {
            margin-right: 15px;
            text-decoration: none;
            color: white;
            background-color: #3498db;
            padding: 10px 14px;
            border-radius: 6px;
            transition: 0.3s;
        }

        .nav-links a:hover {
            background-color: #2c80b4;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 25px;
            background: white;
            box-shadow: 0px 3px 10px rgba(0,0,0,0.1);
        }

        th, td {
            padding: 14px 20px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #2980b9;
            color: white;
        }

        tr:hover {
            background-color: #f1f1f1;
        }

        .action-btn {
            display: inline-block;
            padding: 8px 12px;
            border-radius: 5px;
            text-decoration: none;
            color: white;
            font-size: 14px;
        }

        .edit-btn {
            background-color: #f39c12;
        }

        .edit-btn:hover {
            background-color: #d88f0e;
        }

        .delete-btn {
            background-color: #e74c3c;
        }

        .delete-btn:hover {
            background-color: #c0392b;
        }

        form {
            display: inline;
        }
    </style>
</head>
<body>
    <div class="header">
        <h2>Welcome, <%= session.getAttribute("user") %></h2>
    </div>

    <div class="nav-links">
        <a href="addEmployee.jsp">Add Employee</a>
        <a href="logout">Logout</a>
    </div>

    <table>
        <tr>
            <th>ID</th><th>Name</th><th>Age</th><th>Department</th><th>Salary</th><th>Actions</th>
        </tr>
        <%
        if (employees != null && !employees.isEmpty()) {
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
                    <button type="submit" class="action-btn edit-btn">Edit</button>
                </form>
                <a href="deleteEmployee?id=<%= emp.getId() %>" class="action-btn delete-btn">Delete</a>
            </td>
        </tr>
        <%
            }
        } else {
        %>
        <tr>
            <td colspan="6">No employees found.</td>
        </tr>
        <% } %>
    </table>
</body>
</html>
