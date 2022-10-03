package com.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

@Controller
public class AppController {

	@RequestMapping("/uploadForm")
	public String uploadForm() {

		return "upload-form";
	}

	@RequestMapping("/upload")
	public String upload(@RequestParam MultipartFile file_name, Model model) {

		File storageLocation = new File("C:\\Users\\samaddi\\OneDrive - Capgemini\\Desktop\\sample",
				file_name.getOriginalFilename());

		try {
			file_name.transferTo(storageLocation);
		} catch (Exception e) {
			e.printStackTrace();
		}
		model.addAttribute("file", file_name.getOriginalFilename());

		return "upload";
	}

	@RequestMapping("/download")
	public void download(@RequestParam String fileName, HttpServletRequest request, HttpServletResponse response ) {
		
		File uploadedFileLocation = new File("C:/Users/samaddi/OneDrive - Capgemini/Desktop/sample",fileName);
		System.out.println(uploadedFileLocation);
		FileInputStream fis = null;
		OutputStream os = null;
		
		try {
			fis = new FileInputStream(uploadedFileLocation);
			
			String mimeType = request.getServletContext().getMimeType(fileName);
			System.out.println(mimeType);
			if(mimeType == null) {
				mimeType = "application/octet-stream";
			}
			response.setContentType(mimeType);
			response.setContentLength((int)uploadedFileLocation.length());
			response.setHeader("Content-Disposition", "attachment");
//			response.setHeader("Content-Disposition", "inline;filename="+uploadedFileLocation.getName()); // data will be displayed to user before downloading
//			response.setHeader("Content-Disposition", "attachment;filename=\""+uploadedFileLocation.getName()+"\"");
			
			os = response.getOutputStream();
			int bufferSize = 4096;
			byte[] buffer = new byte[bufferSize];
			int bytesRead = -1;
			
			while((bytesRead = fis.read(buffer))!=-1) {
				os.write(buffer, 0, bytesRead);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				fis.close();
				os.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
	}
}
