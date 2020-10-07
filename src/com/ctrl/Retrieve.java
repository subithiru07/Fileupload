package com.ctrl;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Retrieve extends HttpServlet {
	
       
    
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	File path= new File("C:\\upload");
	String[] l= path.list();
	File[] Fo=path.listFiles();
	/*for(String s:l) {
		System.out.print(s);
	}*/
	request.setAttribute("fileobject", Fo);
	request.setAttribute("file", l);
	request.getRequestDispatcher("retrieve.jsp").forward(request, response);;
	}

}
