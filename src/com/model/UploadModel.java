package com.model;

import java.io.File;

import java.util.List;

import org.apache.commons.fileupload.FileItem;

public class UploadModel
{
public void  uploadFile(List<FileItem> l) {
	String filePath = "C:\\\\upload"; 
	
	for(FileItem f:l){
		
		String name=new File(f.getName()).getName();
		try {
			f.write(new File(filePath+File.separator+name));
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
}
