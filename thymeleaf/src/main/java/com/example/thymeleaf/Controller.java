package com.example.thymeleaf;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
 
@org.springframework.stereotype.Controller
public class Controller {
	@GetMapping("/")
	public String gethome() {
		return "index";
	}
	@RequestMapping(value="/save",method=RequestMethod.POST)
	public ModelAndView save(@ModelAttribute User user) {
		
		ModelAndView modelAndView= new ModelAndView();
		modelAndView.setViewName("user");
		modelAndView.addObject("user",user);
		return modelAndView;
	}
	
}