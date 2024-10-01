package com.hp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "CHAPTERS")
public class Chapter {
	@Id
	@Column(name = "chapter_id")
	private int chapterId;
	@Column(name = "chapter_name")
	private String chapterName;
	@OneToOne
	@JoinColumn(name = "movie_id")
	Movie movie;
	@Column(name = "movie_chapter")
	private int movieChapter;
}
