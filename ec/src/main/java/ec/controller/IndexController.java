package ec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
	
	// トップページに遷移
	@GetMapping(path = "/")
	public String index() {
		
		return "html/index";
	}
}
