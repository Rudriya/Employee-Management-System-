<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    String id = request.getParameter("id") != null ? request.getParameter("id") : "";
    String name = request.getParameter("name") != null ? request.getParameter("name") : "";
    String age = request.getParameter("age") != null ? request.getParameter("age") : "";
    String dept = request.getParameter("department") != null ? request.getParameter("department") : "";
    String salary = request.getParameter("salary") != null ? request.getParameter("salary") : "";
%>
<html>
<head>
    <meta charset="UTF-8" />
    <title>Update Employee</title>
    <style>
        body {
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
            background: linear-gradient(135deg, #a8edea, #fed6e3);
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
        }

        .form-container {
            background: white;
            padding: 30px 40px;
            border-radius: 12px;
            box-shadow: 0 8px 25px rgba(0, 0, 0, 0.15);
            width: 400px;
            box-sizing: border-box;
        }

        h2 {
            margin-bottom: 25px;
            text-align: center;
            color: #333;
        }

        label {
            display: block;
            margin-bottom: 6px;
            font-weight: 600;
            color: #555;
        }

        input[type="text"],
        input[type="number"] {
            width: 100%;
            padding: 12px 10px;
            margin-bottom: 20px;
            border: 1px solid #ccc;
            border-radius: 8px;
            box-sizing: border-box;
            transition: border-color 0.3s;
            font-size: 16px;
        }

        input[type="text"]:focus,
        input[type="number"]:focus {
            border-color: #4a90e2;
            outline: none;
        }

        button {
            width: 100%;
            padding: 14px;
            background-color: #4a90e2;
            color: white;
            font-weight: bold;
            border: none;
            border-radius: 8px;
            cursor: pointer;
            font-size: 16px;
            transition: background-color 0.3s;
        }

        button:hover {
            background-color: #357abd;
        }

        .back-link {
            display: block;
            text-align: center;
            margin-top: 20px;
            text-decoration: none;
            font-weight: 600;
            color: #4a90e2;
        }

        .back-link:hover {
            text-decoration: underline;
        }
    </style>
</head>
<body>
    <div class="form-container">
        <h2>Update Employee</h2>
        <form method="post" action="updateEmployee">
            <input type="hidden" name="id" value="<%= id %>" />
            
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" value="<%= name %>" required />

            <label for="age">Age:</label>
            <input type="number" id="age" name="age" value="<%= age %>" required />

            <label for="department">Department:</label>
            <input type="text" id="department" name="department" value="<%= dept %>" required />

            <label for="salary">Salary:</label>
            <input type="number" id="salary" step="0.01" name="salary" value="<%= salary %>" required />

            <button type="submit">Update Employee</button>
        </form>
        <a href="viewEmployees" class="back-link">⬅ Back to Dashboard</a>
    </div>
</body>
</html>
