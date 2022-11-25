package ca.lambton.A04YutingSha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {
	@Autowired
	private PageCounter pagecounter;
	
	@GetMapping("/")
	public String welcome(Model model) {
		pagecounter.incresePageCounts();
		String count = "The visitor count:"+ pagecounter.getPageCount();
		model.addAttribute("counts",count );
		return "welcome";
	}
}
