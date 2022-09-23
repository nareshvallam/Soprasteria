<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
<style>

li{
float:left;
}
li a{
display:block;
color:white;
text-align:center;
padding:16px;
text-decoration:none;
}
li a:hover{
background-color:red;
}
ul{
list-style-type:none;
padding:0;
margin:0;
overflow:hidden;
background-color:#333333;
}.logo{
text-align:left;}

</style>
</head>
<body>
<div class="logo">
<img src="images/Sopra_Steria_logo_2.svg" alt="image not found">
</div>

<ul>
<li><a href="#Home">Home</a></li>
<li><a href="#Menu">Menu</a></li>
<li><a href="#About">About</a></li>
<li><a href="News">News</a></li>
</ul>
<h1 style="text-align:center;color:#90EE90;"><strong>Welcome <span><%=session.getAttribute("user") %></span></strong></h1>
<form action="logout" mathod="get">
<input type="submit" value="logout">
<hr>
<hr>
</form>
<form action="view" method="post">
<lable for="sub" style="color:blue;border:2px solid black"><i>View Details</i><lable>
<input id="sub" type="submit" value="View Details">
</form>
<hr>
<hr>


</body>
</html>