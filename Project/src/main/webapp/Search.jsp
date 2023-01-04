<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Let's Beat Google- 3C Products</title>
</head>
<body style = "background-image:url('https://imgur.com/hBZ5319.jpg');background-size: cover;background-position:5% 5%;background-repeat:no-repeat;" >
 <div style="text-align:center;
   position: absolute;
   top: 45%;
   left: 35%;
   margin: -100px 0 0 -100px;"><br>
   <h1>Let's Beat Google- 3C Products</h1>
   <form action='${requestUri}' method='get'>
  <input type='text' name='keyword' placeholder = 'Please input the keyword'style="width:300px;height:40px;font-size:16px;"/>
  <input type='submit' value='Search'style="width:120px;height:45px;font-size:16px;font-color:#FDFFFF;border-style: hidden;background-color:#73BF00" />
  </form>
  <form action = 'Main.jsp'>
  </form>
  </div>
</body>
</html>