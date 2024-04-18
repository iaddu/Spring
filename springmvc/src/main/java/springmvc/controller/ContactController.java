package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.model.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("/contact")
	public String showForm() {
		return "contact";
	}
	/*method 1: using traditional way i.e HttpServletRequest
	@RequestMapping(path="/processForm",method = RequestMethod.POST)
	public String handleForm(HttpServletRequest request) {
		String useremail=request.getParameter("email");
		String password=request.getParameter("password");
		System.out.println("useremail: "+useremail);
		System.out.println("userpassword: "+password);
		
		return "";
	}

	*/
	/*
	//method 2 using RequestParam
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(@RequestParam("email") String useremail,
							 @RequestParam("password") String userpassword) {
	    System.out.println("useremail: "+useremail+"\nuserpassword "+userpassword);
		return "";
	}
	*/
	/*
	//not from this method 2 we send these details to success.jsp
	@RequestMapping(path="/processForm" , method=RequestMethod.POST)
	public String handleFrom(@RequestParam("email")String uemail,
							 @RequestParam("password")String upass,
							 Model model){
		model.addAttribute("useremail", uemail);
		model.addAttribute("userpass", upass);
		return "success";
	}
	*/
	//method 2 :using @ModelAttribute
	@RequestMapping(path="/processForm",method=RequestMethod.POST)
	public String handleForm(@ModelAttribute User user ,Model model) {
		this.userService.createUser(user);
		model.addAttribute("user",user);
		return "success";
	}
}
