package com.devsuperior.dslist.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Objects;

@Data
@Entity //para configurar a classe como tabela
@Table(name = "tb_game") //dando o nome para a tabela
public class Game {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String title;
	
	@Column(name = "game_year")
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	
	@Column(columnDefinition = "TEXT") //para strings longas
	private String shortDescription;

	@Column(columnDefinition = "TEXT")
	private String longDescription;
	
	public Game() {
		
	}

	public Game(Long id, String title, Integer year, String genre, String platforms, Double score, String imgUrl,
                String shortDescription, String longDescription) {
		this.id = id;
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.platforms = platforms;
		this.score = score;
		this.imgUrl = imgUrl;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Game other = (Game) obj;
		return Objects.equals(id, other.id);
	}
	
	
}
