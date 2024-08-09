package com.hp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "SPELLS")
public class Spell {
	@Id
	@Column(name = "spell_id")
	private int spellId;
	@Column(name = "spell_name")
	private String incantation;
	@Column(name = "incantation")
	private String spellName;
	@Column(name = "effect")
	private String effect;
	@Column(name = "light")
	private String light;
}
