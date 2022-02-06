package com.sip.ams.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.ArrayList;

@Controller
public class HomeController {

	@RequestMapping("/info")
	public String info(Model model) {
		ArrayList<String> ls = new ArrayList<String>();
	    ls.add("OCA");	
	    ls.add("OCP");
	    ls.add("Spring");
	    ls.add("Angular");
	    model.addAttribute("ls", ls);

	    
		
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
