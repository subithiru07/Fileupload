package com.ctrl;

import java.io.FileInputStream;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Download extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String fname=request.getParameter("file");
		String fpath="C:\\upload/";
		response.setContentType("APPLICATION/OCTET-STREAM");
		response.setHeader("Content-Disposition","attachment;filename=\""+fname+"\"" );
		FileInputStream f=new FileInputStream(fpath+fname);
		int i;
		while((i=f.read())!=-1){
			response.getWriter().write(i);
		}
		f.close();
		
		
	}


}
