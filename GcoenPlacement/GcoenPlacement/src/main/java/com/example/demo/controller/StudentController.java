package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentController {
	
	@GetMapping("/register")
	public ModelAndView register() 
	{
	 ModelAndView mv = new ModelAndView("test");
	 mv.addObject("mykey", "myvalue");
	 return mv;
	 
	}
	
	
	@GetMapping("/login")
	public ModelAndView login() {
		ModelAndView mv= new ModelAndView("test");
		mv.addObject("mykey", "myvalue");
		return mv;
	}
	
	@GetMapping("/studentform")
	public ModelAndView studentform() {
		ModelAndView mv=new ModelAndView("test");
		mv.addObject("mykey", "myvalue");
		return mv;
	}
	@GetMapping("/updateform")
	public ModelAndView updateform() {
		ModelAndView mv=new ModelAndView("test");
		mv.addObject("mykey", "myvalue");
		return mv;
	}
	
	@GetMapping("/forgotpassword")
	public ModelAndView forgotpassword() {
		ModelAndView mv=new ModelAndView("test");
		mv.addObject("mykey", "myvalue");
		return mv;
	}
	
	

}
