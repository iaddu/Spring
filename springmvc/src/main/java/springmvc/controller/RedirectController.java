package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RedirectController {
	/* method 1 to redirect is using redirect prefix
	@RequestMapping("/one")
	public String one() {
		System.out.println("i am one");
		return "redirect:/two";
	}
	*/
	/*
	@RequestMapping("/one")
	public RedirectView one() {
		System.out.println("hii this is one");
		RedirectView rv=new RedirectView();
		rv.setUrl("two");
		return rv;
	}
	*/
	@RequestMapping("/one")
	public void one(HttpServletResponse response) throws IOException {
		System.out.println("i am one");
		
		response.sendRedirect("/springmvc/two");
		
	}
	@RequestMapping("/two")
	public String two() {
		System.out.println("i am two from http one");
		return "about";
	}
	
	
	


}
