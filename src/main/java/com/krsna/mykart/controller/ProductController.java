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
		//Business Logic- 
		//1. Call service
		//2. Service will call DAO -- it may call to DAO to perform business logic
		//							  1. Check whether the city is a valid city for our application.
		//							  2. Get pin fro the city
		//							  3. Check whether sufficient products are available or not
		//3. DAO will fetch data from the database table
		//4. Show the result in VIEW(jsp)
		return mv;
	}
}
