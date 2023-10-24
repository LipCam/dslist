package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.ConsoleDTO;
import com.devsuperior.dslist.service.ConsoleService;

@RestController
@RequestMapping(value = "/consoles")
public class ConsoleController {

	@Autowired
	ConsoleService consoleService;
	
	@GetMapping
	public List<ConsoleDTO> findAll(){
		return consoleService.findAll();
	}
	
	@GetMapping(value = "/{idConsole}")
	public ConsoleDTO findAll(@PathVariable Long idConsole){
		return consoleService.findById(idConsole);
	}
}
