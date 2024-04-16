package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		System.out.println("this is home url");
		model.addAttribute("name","Alpha");
		model.addAttribute("rollno",101);
		return "index";
	}
	@RequestMapping("/about")
	public String about() {
		System.out.println("Guten Tag");
		System.out.println("Wie geht es dir!");
		return "about";
	}
	@RequestMapping("/help")
	public ModelAndView help() {
		System.out.println("this is hlep");
		ModelAndView mv=new ModelAndView();
		List<String>  frind=new ArrayList<>();
		frind.add("alpha");
		frind.add("beta");
		frind.add("gamma");
		mv.addObject("name",frind);
		mv.setViewName("help");
		return mv;
	}
}
