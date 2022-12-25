<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Login</title>
	</head>
	<body>
		<h1>Accedi al portale SC</h1>
		<pre>${errorMessage}</pre>
		<form method="post">
			<label for="name">Nome</label>
			<input type="text" id="name" name="name"/>
			<label for="surname">Cognome</label>
			<input type="text" id="surname" name="surname"/>
			<label for="password">Password</label>
			<input type="password" id="password" name="password"/>
			<button type="submit">Accedi</button>
		</form>
	</body>
</html>