package com.krsna.mykart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {
	
	@GetMapping(value = {"/", "/index"})
	public ModelAndView createProduct() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("index");
		//Get Latest Products
		//Get Categories Dropdown values
		
		
		return mv;
	}
	
	@PostMapping(value = ("/search"))
	public ModelAndView searchProducts() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("search");
		return mv;
	}

}
