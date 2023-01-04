package com.nightcrew.dojos.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.nightcrew.dojos.models.Dojo;
import com.nightcrew.dojos.models.Ninja;
import com.nightcrew.dojos.services.DojoService;
import com.nightcrew.dojos.services.NinjaService;

@Controller
public class MainController {

	@Autowired
	private DojoService dojoService;
	
	@GetMapping("/")
	public String index(@ModelAttribute("dojo") Dojo dojo, Model model) {
		List<Dojo> dojos = dojoService.allDojos();
		model.addAttribute("dojos", dojos);
		return "index.jsp";
	}
	
	@Autowired
	private NinjaService ninjaService;
	
	// create dojo
	//display dojo form
	@GetMapping("/dojos/new")
	public String newDojo(@ModelAttribute("newDojo") Dojo newDojo) {
		return "dojo.jsp";
	}
	// process dojo form
	@PostMapping("/addDojo")
	public String processDojo(@Valid @ModelAttribute("newDojo") Dojo dojo, BindingResult result) {
		if(result.hasErrors()) {
			return "dojo.jsp";
		}
		dojoService.createDojo(dojo);
		return "redirect:/";
	}
	
	//create ninja
	@GetMapping("/ninjas/new")
	public String newNinja(@ModelAttribute("newNinja") Ninja ninja, Model model) {
		List<Dojo> dojoList = dojoService.allDojos();
		model.addAttribute("dojoList", dojoList);
		return "ninja.jsp";
	}
	// process ninja form
	@PostMapping("/addNinja")
	public String processNinja(@Valid @ModelAttribute("newNinja") Ninja ninja, BindingResult result) {
		if(result.hasErrors()) {
			return "ninja.jsp";
		}
		ninjaService.createNinja(ninja);
		return "redirect:/";
	}
	
	@GetMapping("/dojo/{id}")
	public String show(@PathVariable("id")Long id, Model model) {
		Dojo dojo = dojoService.oneDojo(id);
		model.addAttribute("dojo", dojo);
		return "dojodetails.jsp";
	}
}
