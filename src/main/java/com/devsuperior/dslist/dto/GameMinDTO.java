package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import com.devsuperior.dslist.projections.GameMinProjection;
import lombok.Data;

@Data
public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String imgUrl;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}
	
	public GameMinDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}
	
	public GameMinDTO(GameMinProjection entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getGameYear();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
	}


	
	
}
