package com.krsna.mykart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ProfileController {
	
	@GetMapping(value = "/showProfileForm")
	public ModelAndView showProfileForm() {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("show-create-profile-form");
		return mv;
	}

}
