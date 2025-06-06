<html>
<head><title>Login</title></head>
<body>
<h2>Login</h2>
<form method="post" action="login">
    Username: <input type="text" name="username" required /><br/>
    Password: <input type="password" name="password" required /><br/>
    <button type="submit">Login</button>
</form>
<% if (request.getParameter("error") != null) out.print("Invalid login!"); %>
</body>
</html>
