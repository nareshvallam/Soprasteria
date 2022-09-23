<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title style="color:blue;"> Sopra Steria - Login Page</title>
<link type="text/css" rel="stylesheet" href="css/peace.css" >
<style> 

li{
float:left;
}
li a{
display:block;
color:orange;
text-align:center;
padding:16px;
text-decoration:none;
}
li a:hover{
background-color:blue;
}
ul{
list-style-type:none;
padding:0;
margin:0;
overflow:hidden;
background-color:#333333;
}
.det{
text-align:center;
border: 4px solid black;
width:400px;
display:inline-block;
box-shadow: 5px 5px blue;

}
.tex{
text-align:left;
padding-left:10px;
}
body{
	text-align:center;
}
.logo{
text-align:left;}
hr{
  border-top: 4px solid black;
  box-shadow: 1px 5px blue;
}
box:hover{
background-color: black;
}

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
<h1 style="text-align:center;color:#90EE90;"><strong>Continue your where you logout off.</strong></h1></br>
<div class="det" >
<form action="login" method="post">
<label><h1 class="tex">Login</h1></label>
<lable><h3 style="color:pink;" class="tex" >to your Account</h3></lable><hr>
<lable  for="user" style="font-size:120%;" >user name:</lable><br>
<input class="box" type="text" id="user" name="user" style="width:200px; height:20px; color:blue;background-color:rgb(235,237,239);" autofocus ><br><br>
<lable for="pass" style="font-size:120%;" >password:  </lable><br>
<input class="box" type="password" id="pass" name="pass" style="width:200px; height:20px; color:blue;background-color:rgb(235,237,239); "><br><br>
<input type="submit" value="log In" ><br>
<input type="checkbox" id="check">
<lable class="tex"  for="check" style="color:black;">Remember me</lable><br>

<p Style="color:red;">Don't have an account?<span><a href="http://localhost:8081/Project123/p1Registration.jsp" style="text-decoration:none;color:violet;"> Sign Up </a></span></p>

</form>
</div>

</body>
</html>