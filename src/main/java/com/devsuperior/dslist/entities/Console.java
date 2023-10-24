package com.devsuperior.dslist.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tb_consoles")
public class Console {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long idConsole;
	String description;
	
	public Console() {
		
	}
}
