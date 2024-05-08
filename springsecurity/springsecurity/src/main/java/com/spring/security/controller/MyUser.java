package com.spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class MyUser {

    @GetMapping("/home")
    public String userLogin() {
        return "redirect:/home/Login.html"; // Redirect to static HTML file
    }
	 @GetMapping("/viewAll")
	    public String viewAll(Model model) {
	     /*   var users = userRepository.findAll(); // Fetch all users from the database
	        model.addAttribute("users", users); // Add users to the model
	        */
	        return "redirect:/home/ViewAll.html"; // Return the ViewAll.html page from the templates folder
	    }
	    
}
