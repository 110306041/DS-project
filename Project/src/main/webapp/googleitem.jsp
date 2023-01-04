<%@ page language="java" contentType="text/html; charset=UTF-8"
 pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>3C-ProductsSearch</title>

<style type="text/css">
#padding{
 padding: 0px 0px 0px 15px;
}
a {
 color: #0B173B;
 font-size: 20px;
 text-decoration: none;
}
a:hover{
text-decoration:underline;
}
.border-style {
 
}
</style>
</head>
<body>
<body style = "background-image:url('https://imgur.com/hBZ5319.jpg');background-size: cover;background-position:5% 5%;background-repeat:no-repeat;" >

<form action='${requestUri}' method='get'>

 

 
 <div style='position: absolute;background-color:#FFF0AC ;margin-top:100px;margin-left:230px;width:800px;height:400px;overflow:scroll'>
 <div style='position: absolute;margin-top:10px;margin-left:50px'>
  <%
  String[][] orderList = (String[][]) request.getAttribute("query");
  for (int i = 0; i < orderList.length; i++) {
   String s=orderList[i][1]; 
    
  %>
  
  <a href='<%=s%>'><%=orderList[i][0]%> </a> <br>*****************************************************************************<br>
  
  <%
}
%>
 </div>
 </div>

 
 
 <div>

 </div>
 
 <div style="text-align:center;
   position: absolute;
   top: 10%;
   left: 55%;
   margin: -30px 0 0 -500px;">
 <input type='text' class="border-style" id="padding"  
 style='font-size:120%;width:500px;height:45px' name='keyword' placeholder='Please input the keyword'
 onfocus="placeholder= '' " onblur="placeholder='Please input the keyword'" />
 <input type='submit' value='Search'style="width:120px;height:45px;font-size:16px;font-color:#FDFFFF;border-style: hidden;background-color:#73BF00 "/>
 </div>
 
<div>

</div>



</form>
</body>
</html>