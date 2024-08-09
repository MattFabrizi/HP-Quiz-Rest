package com.hp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "HPCHARACTER")
public class HpCharacter {
	@Id
	@Column(name = "character_id")
	private Integer characterId;
	@Column(name = "character_name", nullable = false)
	private String characterName;
	@Column(name = "species")
	private String species;
	@Column(name = "gender")
//	@Enumerated(EnumType.STRING)
//	private Gender gender;
	private String gender;
	@Column(name = "house")
//	@Enumerated(EnumType.STRING)
//	private House house;
	private String house;
	@Column(name = "patronus")
	private String patronus;
	@Column(name = "wand_wood")
	private String wandWood;
	@Column(name = "wand_core")
	private String wandCore;
}
