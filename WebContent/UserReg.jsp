<H1>New User form</H1>
<head>
<script>  
function emailval(){
	var reEmail=/^([A-Za-z0-9_\-\.])+\@([A-Za-z0-9_\-\.])+\.([A-Za-z]{2,4})$/;
    var email= document.form1.id.value;
    
    if(!reEmail.test(email)){
    	alert("Please provide a valid email address");
    	return false;
        }
}
</script>
<link rel="stylesheet" href="sign.css">
<body background ="Website-design-BG.jpg">
<div class="newuserhome">
<form name="form1" action="http://localhost:8989/UploadServer/RegUser" method="post">

<div class="id">
Enter the id <input type="text" name="id" required placeholder="Email Id" ><br>

</div>

<div class="user">
Enter the Login Name<input type="text" name="username" required placeholder="User Name"><br>
</div>
<div class="pwd">
Enter the Login Password<input type="password" name="pwd" required placeholder="Password">
</div>
<input type="submit" value="SingUp" onclick="emailval()">
</div>
</form>
</head>
