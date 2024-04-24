package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FormController {
	@RequestMapping("/complex")
	public String show_form() {
		return "complex_form";
	}
	
	@RequestMapping(path="/handleform",method=RequestMethod.POST)
	public String formHandler(@ModelAttribute Student student ,BindingResult result,
			Model model)
	{
		if(result.hasErrors()) {
			return "complex_form";
		}
		model.addAttribute("std1",student);
		System.out.println(student);
		return "success";
	}
}
