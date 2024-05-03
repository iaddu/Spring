package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GenerateException {
	
	@RequestMapping("/exception")
	public String generate() {
		String str=null;
		System.out.println(str.length());
		return "home";
	}
}
