package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/info")
	public String info(Model model) {
		
		String formation = "fullstack";
		model.addAttribute("Workshop", formation);
		
		System.out.println("a");
	

		return "Home/info";
		
	}

	@RequestMapping("/Affichage")

	public String Affichage() {
		System.out.println("Methode affichage");

		return "Home/Affichage";
	}

}
