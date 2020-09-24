package com.krsna.mykart.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {
	
	
	@GetMapping(value = "/dashboard")
	public String getDashboard() {
		System.out.println("DashboardController.getDashboard()");
		return "dashboard";
	}

}
