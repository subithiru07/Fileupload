function emailval(){
var mailid=document.form1.id.value;
var mailformat = /^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$/;
if(mailid.value.match(mailformat)){
document.form1.id.focus();
return true;
}
else{
alert("you have entered an invalid email id");
document.form1.id.focus();
return false;
}
}