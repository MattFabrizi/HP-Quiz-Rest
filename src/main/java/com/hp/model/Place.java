package com.hp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "PLACES")
public class Place {
	@Id
	@Column(name="place_id")
	private int placeId;
	@Column(name="place_name")
	private String placeName;
	@Column(name="place_category")
	private String placeCategory;
}
