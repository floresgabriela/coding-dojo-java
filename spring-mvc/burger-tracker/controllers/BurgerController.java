package com.nightcrew.burger.controllers;

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
import org.springframework.web.bind.annotation.PutMapping;

import com.nightcrew.burger.models.Burger;
import com.nightcrew.burger.services.BurgerService;

@Controller
public class BurgerController {

	@Autowired
	private BurgerService burgerService;
	
	@GetMapping("/burgers") // display index
	public String dashboard(@ModelAttribute("burger") Burger burger, Model model) {
		List<Burger> burgers = burgerService.allBurgers();
		model.addAttribute("burgerList", burgers);
		return "index.jsp";
	}
	
	@GetMapping("/burgers/{id}") //display edit page
	public String oneBurger(@PathVariable("id")Long id, Model model) {
		Burger burger = burgerService.oneBurger(id);
		model.addAttribute("burger", burger);
		return "oneburger.jsp";
	}
	
	@PostMapping("/addBurger")
	public String add(@Valid @ModelAttribute("burger") Burger burger, BindingResult result, Model model) {
		if(result.hasErrors()) {
			return "index.jsp";
		}
		burgerService.addBurger(burger);
		return "redirect:/burgers";
	}
	
	@PutMapping("/edit/{id}")
	public String processUpdate(@Valid @ModelAttribute("burger") Burger burger, BindingResult result) {
		if(result.hasErrors()) {
			return "oneburger.jsp";
		}
		burgerService.updateBurger(burger);
		return "redirect:/burgers";
	}
	
}
