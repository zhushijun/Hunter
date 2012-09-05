package com.hunter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class WelcomeController {
	

	@RequestMapping("/welcome")
	public String welcome(ModelMap modelMap){
		String message  = "hello world";
		modelMap.addAttribute("message", message);
		return "/website/welcome";
	}
	
}
