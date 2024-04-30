package springmvcsearch;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

@Controller
public class FileUploadController {
	
	@RequestMapping("/fileform")
	public String showUploadForm() {
		return "fileform";
	}
	@RequestMapping(path="/uploadImage",method=RequestMethod.POST)
	public String fileUpload(@RequestParam("profile")  CommonsMultipartFile file,
			HttpSession s) {
		System.out.println("file uploaded");
		System.out.println(file.getName());
		System.out.println(file.getSize());
		System.out.println(file.getContentType());
		String path=s.getServletContext().getRealPath("/")+
				"WEB-INF"+File.separator+
				"resources"+File.separator+
				"images"+File.separator+
				file.getOriginalFilename();
		System.out.println(path);
		byte data[] =file.getBytes();
		try {
			FileOutputStream fos=new FileOutputStream("path");
			fos.write(data);
			fos.close();
			System.out.print("file uploaded");
		}
		catch(IOException e) {
			e.printStackTrace();
			System.out.println("uploading error");
		}
		return "filesuccess";
	}

}
