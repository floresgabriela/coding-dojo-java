package com.nightcrew.burger.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.nightcrew.burger.models.Burger;
import com.nightcrew.burger.services.BurgerService;

@RestController
@RequestMapping("/api")
public class APIController {
	
	private final BurgerService burgerService;
	
	public APIController(BurgerService burgerService) {
		this.burgerService = burgerService;
	}
	
	//get all
	@RequestMapping("/burgers")
	public List<Burger> getAllBurgers() {
		return burgerService.allBurgers();
	}
	
	//create
	@PostMapping("/burgers")
	public Burger createBurger(
			@RequestParam("burgerName") String burgerName,
			@RequestParam("restaurant") String restaurant,
			@RequestParam("rating") Integer rating,
			@RequestParam("notes") String notes) {
			Burger newBurger = new Burger(burgerName, restaurant, rating, notes);
			return burgerService.addBurger(newBurger);
		}
	
	// get one
	@GetMapping("/burgers/{id}")
	public Burger getOneBurger(@PathVariable("id") Long id) {
		return burgerService.oneBurger(id);
	}
	
	//find one and create
	@PutMapping("/burgers/{id}")
	public Burger editBurgerProcess(
			@PathVariable("id") Long id,
			@RequestParam("burgerName") String burgerName,
			@RequestParam("restaurant") String restaurant,
			@RequestParam("rating") Integer rating,
			@RequestParam("notes") String notes) {
		Burger foundBurger = burgerService.oneBurger(id);
		foundBurger.setBurgerName(burgerName);
		foundBurger.setRestaurant(restaurant);
		foundBurger.setRating(rating);
		foundBurger.setNotes(notes);
		return burgerService.updateBurger(foundBurger);
	}
	
	// delete
	@DeleteMapping("/burgers/{id}")
	public void deleteDonation(@PathVariable("id") Long id) {
		burgerService.deleteBurger(id);
	}
	
}

