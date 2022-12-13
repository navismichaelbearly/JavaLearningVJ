<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link href="design/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<h1>Welcome</h1>
	<form action="LoginController" method="post">
		<table align="center">
			<tr>
				<td align="center">
					<table>
						<tr>
							<td>Username</td>
							<td><input type="text" name="uname" required /></td>
						</tr>
						<tr>
							<td>Password</td>
							<td><input type="password" name="pwd" required /></td>
						</tr>
					</table>
				</td>
			</tr>


			<tr>
				<td align="center"><input type="submit" value="Login" class="button" /></td>
			</tr>
		</table>
	</form>
</body>
</html>