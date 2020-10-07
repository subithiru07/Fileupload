<html > 
<head>
<center>
<link rel="stylesheet" href="Home.css">
<div class="home">
<h1>File Uploding </h1>
<body background ="Website-design-BG.jpg">
</head>
<div class="blinking">Upload any format and size</div>
<div class="one">
<form  action="http://localhost:8989/FileToUpload/Ctrl" method="post" enctype="multipart/form-data"> 
Choose a file from system:<input type="file" name="multifile" size="70">
<input  type="submit" value="upload" > 
</form>
</div>

<div class="view">
<a href="Retrieve" >View the List of File</a>
<a href="UserReg.jsp">SignUp</a>
<a href="Signin.jsp">SignIn</a>
</div>



</body>
</div>
</center>

</html>