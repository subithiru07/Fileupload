<%@page import=" java.io.*" %>

<html>
<head>
<link rel="stylesheet" href="View.css">
<% String[] s= (String[])request.getAttribute("file");
   File[] f = (File[])request.getAttribute("fileobject");%>

<% for(int i=0;i<s.length;i++){ %>


<div class="view">
<a href="View.jsp?name=<%=s[i]%>"> <%=s[i]%> read a file</a><br>
</div>
<div class="data">
<a href="Download?file=<%=s[i]%>"> <%=s[i]%> download a file</a><br>
	</div>
	
<%}%>
</head>
</html>