package com.spring.security.controller;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CustomErrorController implements ErrorController {
    @RequestMapping("/error")
    public String handleError(Model model) {
        // You can add additional logic here to extract error details
        model.addAttribute("errorMessage", "An error occurred. Please try again.");
        return "redirect:/home/error.html"; // Return the ViewAll.html page from the templates folder
    }
}
