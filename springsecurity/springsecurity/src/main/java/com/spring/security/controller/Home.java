package com.spring.security.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/home")

public class Home {
	
    @GetMapping
    public String home() {
        return "redirect:/home/Home.html"; // Redirect to static HTML file
    }

    @GetMapping("/adminlogin")
    public String adminLogin() {
        return "redirect:/home/Login.html"; // Redirect to static HTML file
    }

    @GetMapping("/userlogin")
    public String userLogin() {
        return "redirect:/home/Login.html"; // Redirect to static HTML file
    }
    
    @PostMapping("/commonLogin")
    public void login(@RequestParam("email") String email,@RequestParam("password") 
    String password) {
    	System.out.println("email: "+email+"\npassword: "+password);
    }
}
