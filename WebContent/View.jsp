<%@page import=" java.io.*" %>
<% 
//String fileName= request.getParameter("filename");
String s1=request.getParameter("name");


//System.out.print(s1);

//File f = new File(s1);
FileInputStream fI= new FileInputStream("C:\\upload/"+s1);
 for(int i=0;i<fI.available();i++){
 	out.println((char)fI.read());
 }
fI.close();
%>