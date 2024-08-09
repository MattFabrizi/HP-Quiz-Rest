package com.hp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "MOVIES")
public class Movie {
	@Id
	@Column(name = "movie_id")
	private int movieId;
	@Column(name = "movie_title")
	private String movieTitle;
	@Column(name = "release_year")
	private int year;
	@Column(name = "runtime")
	private int runtime;
	@Column(name = "budget")
	private String budget;
	@Column(name = "boxoffice")
	private String boxOffice;
}
