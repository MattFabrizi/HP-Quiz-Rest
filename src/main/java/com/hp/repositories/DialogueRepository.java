package com.hp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hp.model.Dialogue;

public interface DialogueRepository extends JpaRepository<Dialogue, Integer> {
	public Dialogue findFirstByOrderByDialogueIdDesc();
}
