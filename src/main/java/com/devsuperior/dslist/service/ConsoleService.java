package com.devsuperior.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperior.dslist.dto.ConsoleDTO;
import com.devsuperior.dslist.entities.Console;
import com.devsuperior.dslist.repository.ConsoleRepository;

@Service
public class ConsoleService {

	@Autowired
	ConsoleRepository consoleRepository;
	
	@Transactional(readOnly = true)	
	public List<ConsoleDTO> findAll(){
		return consoleRepository.findAll().stream().map(x -> new ConsoleDTO(x)).toList();
	}
	
	@Transactional(readOnly = true)	
	public ConsoleDTO findById(Long idConsole){
		Console console = consoleRepository.findById(idConsole).orElse(null);
		if(console != null)
			return new ConsoleDTO(console);
		return null;
	}
}
