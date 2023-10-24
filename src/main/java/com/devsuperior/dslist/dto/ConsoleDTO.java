package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Console;
import lombok.Data;

@Data
public class ConsoleDTO {

	Long idConsole;
	String description;
	
	public ConsoleDTO(Console console) {
		idConsole = console.getIdConsole();
		description = console.getDescription();
	}
}
