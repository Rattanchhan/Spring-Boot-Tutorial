package com.fileUploadServlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.util.Collection;

@MultipartConfig 
public class FileUpload extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		    final Collection<Part> parts = request.getParts();
			/* Part part = request.getPart("file"); */
			 for (final Part part : parts) { 
		       part.write("C:\\Users\\Rattana\\Desktop\\Employee\\Servlet&JspCopy\\FileUploadServlet\\SingleFileupload\\"+part.getSubmittedFileName());
		    }
		    response.getWriter().print("The file has been uploaded successfully.");
		} catch (Exception e) {
		    response.sendError(HttpServletResponse.SC_INTERNAL_SERVER_ERROR, "Upload failed.");
		}
		
	}

}
