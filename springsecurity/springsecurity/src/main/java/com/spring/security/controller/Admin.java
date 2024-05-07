package com.spring.security.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/admin")
public class Admin {
    @GetMapping("/viewAll")
    public String viewAll(Model model) {
     /*   var users = userRepository.findAll(); // Fetch all users from the database
        model.addAttribute("users", users); // Add users to the model
        */
        return "ViewAll"; // Return the ViewAll.html page from the templates folder
    }
    
}
