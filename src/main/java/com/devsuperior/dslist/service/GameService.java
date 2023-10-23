package com.devsuperior.dslist.service;

import com.devsuperior.dslist.dto.GameDTO;
import com.devsuperior.dslist.dto.GameMinDTO;
import com.devsuperior.dslist.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
			
	@Transactional(readOnly = true)
	public List<GameMinDTO> findAll() {
		return gameRepository.findAll().stream().map(x -> new GameMinDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)
	public GameDTO findById(Long Id) {
		return new GameDTO(gameRepository.findById(Id).get());
	}
	
	@Transactional(readOnly = true)
	public List<GameMinDTO> findByList(Long listId) {
		return gameRepository.searchByList(listId).stream().map(x -> new GameMinDTO(x)).toList();
	}
}
