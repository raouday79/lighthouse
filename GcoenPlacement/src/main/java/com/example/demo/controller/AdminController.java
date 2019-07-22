package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {
	
		@GetMapping("/login")
		public ModelAndView loginCheck()
		{
			ModelAndView mv = new ModelAndView("sucess");
			
			mv.addObject("mykey", "myValue");
			return mv;
		}
		
		

}
