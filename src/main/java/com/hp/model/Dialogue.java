package com.hp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "DIALOGUE")
public class Dialogue {
	@Id
	@Column(name="dialogue_id")
	private int dialogueId;
	@OneToOne
	@JoinColumn(name="chapter_id")
	Chapter chapter;
	@OneToOne
	@JoinColumn(name="place_id")
	Place place;
	@OneToOne
	@JoinColumn(name="character_id")
	HpCharacter character;
	@Column(name="dialogue")
	private String dialogue;
}
