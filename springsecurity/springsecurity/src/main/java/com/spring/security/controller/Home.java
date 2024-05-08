package com.spring.security.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.security.model.User;
import com.spring.security.service.UserService;

@Controller
@RequestMapping("/home")
public class Home {

    @Autowired
	UserService userService;
    
	@Autowired
	PasswordEncoder passwordEncoder;
	
	
	@GetMapping()
    public String home() {
        return "redirect:/home/Home.html"; // Redirect to static HTML file
    }
	@GetMapping("/happy")
    public String happy() {
		User user=new User(101,"adi@123","123","ADMIN");
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userService.createUser(user);
        return "redirect:/home/Home.html"; // Redirect to static HTML file

    }
    
	
	@GetMapping("/happy/happy")
    public String happyhappy() {
        return "redirect:/home/Home.html"; // Redirect to static HTML file
    }
	
	
    @PostMapping("/commonLogin")
    public String login(@RequestParam("email") String email,@RequestParam("password") 
    String password) {
    	System.out.println("email: "+email+"\npassword: "+password);
        return "redirect:/home/Home.html"; // Redirect to static HTML file

    }
    
    //why it not taking this endpoint as access to all
	@PostMapping("/register")
	public String createUser(@RequestBody User user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		userService.createUser(user);
		System.out.println("user successfull saved");
        return "redirect:/home/Home.html"; // Redirect to static HTML file
	}
}
