package com.spring.security.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.security.model.Employee;
import com.spring.security.model.User;
import com.spring.security.service.UserService;
@Controller
@RequestMapping("/admin")
public class Admin {
	 @GetMapping("/home")
	    public String adminLogin() {
	        return "redirect:/home/Login.html"; // Redirect to static HTML file
	    }
	    
    @GetMapping("/viewAll")
    public String viewAll(Model model) {
     /*   var users = userRepository.findAll(); // Fetch all users from the database
        model.addAttribute("users", users); // Add users to the model
        */
        return "redirect:/home/ViewAll.html"; // Return the ViewAll.html page from the templates folder
    }
    
    @Autowired
 	UserService userService;
     
 	@Autowired
 	PasswordEncoder passwordEncoder;
 	
 	
 	
 	@PostMapping("/register")
     public String happy(@RequestParam("employee_name") String name
    		 ,@RequestParam("email") String email
    		 ,@RequestParam("password")String password) {
 		password=passwordEncoder.encode(password);
 	User user=new User(1,email,password,"EMPLOYEE");
 	userService.createUser(user);
 	
 	Employee employee =new Employee(1,name,email,password);
 	userService.createEmployee(employee);
         return "redirect:/home/Home.html"; // Redirect to static HTML file
     }
     
    
}
