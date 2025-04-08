package com.example.microservico;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexReturn {
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
