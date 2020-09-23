package com.krsna.mykart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProductController {

	
	@GetMapping(value = "/showCreateProductForm")
	public ModelAndView createProduct() {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("show-create-product-form");
		return mv;
	}
}
