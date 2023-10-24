package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.PlayerDTO;
import com.devsuperior.dslist.entities.Player;
import com.devsuperior.dslist.repository.PlayerRepository;

@Service
public class PlayerService {

	@Autowired
	PlayerRepository playerRepository;
	
	@Transactional(readOnly = true)
	public List<PlayerDTO> findAll(){
		return playerRepository.findAll().stream().map(x -> new PlayerDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)	
	public PlayerDTO findById(Long idPlayer){
		Player player = playerRepository.findById(idPlayer).orElse(null);
		
		if(player != null)
			return new PlayerDTO(player);
		return null;
	}
}
