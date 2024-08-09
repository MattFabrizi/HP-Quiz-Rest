package com.hp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hp.model.HpCharacter;

public interface HpCharacterRepository extends JpaRepository<HpCharacter, Integer> {

}
