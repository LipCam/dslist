package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Player;
import lombok.Data;

@Data
public class PlayerDTO {

	Long idPlayer;
	String name;

	public PlayerDTO(Player entity) {
		idPlayer = entity.getIdPlayer();
		name = entity.getName();
	}
}
