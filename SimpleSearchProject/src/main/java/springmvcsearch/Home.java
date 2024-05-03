package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Home {
	@RequestMapping("/home1")
	public String home(){
		return "home1";
	}
	
	@RequestMapping(path="/welcome",method = RequestMethod.POST)
	public String welcome(@RequestParam("name") String name,Model model) {
		model.addAttribute("name",name);
		return "welcome";
	}
}
