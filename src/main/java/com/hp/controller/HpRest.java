package com.hp.controller;

import java.util.HashSet;
import java.util.Optional;
import java.util.Random;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hp.model.Dialogue;
import com.hp.repositories.DialogueRepository;
import com.hp.repositories.HpCharacterRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/")
public class HpRest {

	@Autowired
	HpCharacterRepository hpCharacterRepo;
	
	@Autowired
	DialogueRepository dialogueRepo;

	@GetMapping("/quiz/dialogue")
	public Optional<Dialogue> getDialogueQuestion() {
		int lastId = dialogueRepo.findFirstByOrderByDialogueIdDesc().getDialogueId();
		int rnd = getRandomNumber(1, lastId+1);
		return dialogueRepo.findById(rnd);
	}
	
	private int getRandomNumber(int min, int max) {
	    Random random = new Random();
	    return random.nextInt(max - min) + min;
	}
	
	@GetMapping("/random/hpCharacters")
	public Set<String> getRandomCharacters() {
		Set<String> hpNames = new HashSet<String>();
		while(hpNames.size() < 10) {
			int rnd = getRandomNumber(1, 126);
			hpNames.add(hpCharacterRepo.findById(rnd).get().getCharacterName());
		}
		return hpNames;
	}

}
