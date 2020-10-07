package com.ctrl;

import java.io.File;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import com.model.UploadModel;

public class UploadCtrl extends HttpServlet {

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
			
		if(ServletFileUpload.isMultipartContent(request)) {

			
			DiskFileItemFactory fact = new DiskFileItemFactory();
			List<FileItem> Mu;
			try {
				Mu = new ServletFileUpload(fact).parseRequest(request);
				UploadModel m= new UploadModel();
			m.uploadFile(Mu);
			request.setAttribute("msg", "File uploaded successfully");
			request.getRequestDispatcher("/op.jsp").forward(request, response);
			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		}
		}
