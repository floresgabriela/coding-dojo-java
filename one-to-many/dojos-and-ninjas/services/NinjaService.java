package com.nightcrew.dojos.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nightcrew.dojos.models.Ninja;
import com.nightcrew.dojos.repositories.NinjaRepository;

@Service
public class NinjaService {

	@Autowired
	private NinjaRepository ninjaRepo;
	
	//create
	public Ninja createNinja(Ninja ninja) {
		return ninjaRepo.save(ninja);
	}
	
	public List<Ninja> allNinjas() {
		return ninjaRepo.findAll();
	}
}
