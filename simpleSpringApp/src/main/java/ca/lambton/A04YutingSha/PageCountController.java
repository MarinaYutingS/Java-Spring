package ca.lambton.A04YutingSha;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PageCountController {
	
	@Autowired
	private PageCounter pagecounter;
	
	@GetMapping("/currentcount")
	public Integer getPageCount() {
		
		return pagecounter.getPageCount();
	}
}
