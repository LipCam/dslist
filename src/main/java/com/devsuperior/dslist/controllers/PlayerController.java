package com.devsuperior.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.dslist.dto.PlayerDTO;
import com.devsuperior.dslist.service.PlayerService;

@RestController
@RequestMapping(value = "/players")
public class PlayerController {

	@Autowired
	PlayerService playerService;
	
	@GetMapping
	public List<PlayerDTO> findAll(){
		return playerService.findAll();
	}
	
	@GetMapping(value = "/{idPlayer}")
	public PlayerDTO findById(@PathVariable Long idPlayer){
		return playerService.findById(idPlayer);
	}
}
