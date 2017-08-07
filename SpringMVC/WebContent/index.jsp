<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
		<title>Insert title here</title>
	</head>
	<body>
		<a href="springmvc/testRequestMapping">springmvc/testRequestMapping</a>
		
		
		<br><br><br><br>
		<a href="helloworld">helloworld</a>
		
		
		<br><br><br><br>
			<form action="springmvc/testMethod" method="post">
				<input type="submit" value="springmvc/testMethod">
			</form>
		<br><br><br><br>
		
		<a href="springmvc/testParamsAndHeaders?username=aa&&age=11">testParamsAndHeaders</a>
		
		<br><br><br><br>
		<a href="springmvc/testAntPath/aaaaa/aa">testAntPath</a>
		
		<br><br><br><br>
		<a href="springmvc/testPathVariable/1">test PathVariable</a>
		
		<br><br><br><br>
		<a href="springmvc/testRest/1">springmvc/testRest GET</a>
		
		<br><br><br><br>
		<form action="springmvc/testRest" method="POST">
			<input type="submit"  value="springmvc/testRest POST">
		</form>
		
		<br><br><br><br>
		<form action="springmvc/testRest" method="POST">
			<input type="hidden" name="_method" value="put">
			<input type="submit"  value="springmvc/testRest  put">
		</form>
		
		<br><br><br><br>
		<form action="springmvc/testRest" method="POST">
		<input type="hidden" name="_method" value="delete">
			<input type="submit"  value="springmvc/testRest DELETE">
		</form>
		
		<br><br><br><br>
		<a href="springmvc/testRequestParam?username=wzl&age=22">springmvc/testRequestParam</a>
		
		<br><br><br><br>
		<a href="springmvc/testCookieValue">springmvc/testCookieValue</a>
		
		
		<br><br><br><br>
		<a href="springmvc/testHeader">springmvc/testCookieValue</a>
		
		<br><br><br><br>
		
		<form action="springmvc/pojo">
			username:<input type="text" name="username"><br>
			password:<input type="password" name="password"><br>
			email:<input type="text" name="email"><br>
			city:<input type="text" name="address.city"><br>
			province:<input type="text" name="address.province"><br>
			<input type="submit" value="submit">
		</form>
		<br><br><br><br>
		
		<a href="springmvc/testModelAndView">spring/testModelAndView</a>
		
		<br><br><br><br>
		
		<a href="springmvc/testMap">springmvc/testMap</a>
		
		<br><br><br><br>
		
		<a href="springmvc/testSessionAttribute">springmvc/testSessionAttribute</a>
		
		<br><br><br><br>
		
		<form action="springmvc/testModelAttribute" method="Post">
			<input type="hidden" name="id" value="1"/>
			username: <input type="text" name="username" value="Tom"/>
			<br>
			email: <input type="text" name="email" value="tom@atguigu.com"/>
			<br>
			<!-- age: <input type="text" name="age" value="12"/> -->
			<br>
			<input type="submit" value="Submit"/>
		</form>
		
		<br><br><br><br>
				
	</body>
</html>