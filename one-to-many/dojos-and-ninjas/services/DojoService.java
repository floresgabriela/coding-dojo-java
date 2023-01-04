package com.nightcrew.dojos.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nightcrew.dojos.models.Dojo;
import com.nightcrew.dojos.repositories.DojoRepository;

@Service
public class DojoService {

		@Autowired
		private DojoRepository dojoRepo;
	
		
	// create
		public Dojo createDojo(Dojo dojo) {
			return dojoRepo.save(dojo);
		}
		
	// find one
		public Dojo oneDojo(Long id) {
			Optional<Dojo> optionalDojo = dojoRepo.findById(id);
			if(optionalDojo.isPresent()) {
				return optionalDojo.get();
			} else {
				return null;
			}
		}
		
		public List<Dojo> allDojos() {
			return dojoRepo.findAll();
		}
}
