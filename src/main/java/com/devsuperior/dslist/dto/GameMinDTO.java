package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import lombok.Data;
//import com.devsuperior.dslist.projections.GameMinProjection;

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
	
//	public GameMinDTO(GameMinProjection entity) {
//		id = entity.getId();
//		title = entity.getTitle();
//		year = entity.getGameYear();
//		imgUrl = entity.getImgUrl();
//		shortDescription = entity.getShortDescription();
//	}


	
	
}
