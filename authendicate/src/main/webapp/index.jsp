<html>
<head>
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script>
</head>
<body>
	<h2>Login</h2>
	<form action="/signin" action="post">
		<table>
			<tr>
				<td>User Name</td>
				<td><input name="username" id="username"></td>
			</tr>
			<tr>
				<td>Password</td>
				<td><input name="password" id="password"></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="button" name="submit" id="submit"
					value="Submit"></td>
			</tr>
		</table>
	</form>
</body>
</html>
<script type="text/javascript">
$(document).ready(function(){
	$("#submit").click(function(){
		$.ajax({
			type: "post",
			contentType: "application/x-www-form-urlencoded",
			url: "./api/signin",
			data: {"username": $("#username").val(), "password": $("#password").val()},
			success: function(data){
				window.location.href = "/home.jsp";	
			}
		});
	});
});
</script>