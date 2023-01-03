package com.nightcrew.burger.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nightcrew.burger.models.Burger;
import com.nightcrew.burger.repositories.BurgerRepository;

@Service
public class BurgerService {
	
//	private final BurgerRepository burgerRepo;
//	
//	public BurgerService(BurgerRepository burgerRepo) {
//		this.burgerRepo = burgerRepo;
//	}
	@Autowired
	private BurgerRepository burgerRepo;
	
	// get all burgers
	public List<Burger> allBurgers() {
		return burgerRepo.findAll();
	}
	
	// create
	public Burger addBurger(Burger newBurger) {
		return burgerRepo.save(newBurger);
	}
	
	// find one
	public Burger oneBurger(Long id) {
		Optional<Burger> optionalBurger = burgerRepo.findById(id);
		if(optionalBurger.isPresent()) {
			return optionalBurger.get();
		}
		else {
			return null;
		}
	}
	
	// update
	public Burger updateBurger(Burger foundBurger) {
		return burgerRepo.save(foundBurger);
	}
	
	// delete
	public void deleteBurger(Long id) {
		burgerRepo.deleteById(id);
	}
	
}
