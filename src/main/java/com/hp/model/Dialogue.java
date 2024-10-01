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
	private Chapter chapter;
	@OneToOne
	@JoinColumn(name="place_id")
	private Place place;
	@OneToOne
	@JoinColumn(name="character_id")
	private HpCharacter character;
	@Column(name="dialogue")
	private String dialogue;
}
