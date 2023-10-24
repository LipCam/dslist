package com.devsuperior.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_players")
public class Player {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idPlayer;
	String name;
	
	public Player() {
		
	}
}
