package com.devsuperior.dslist.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dslist.entities.Player;

public interface PlayerRepository extends JpaRepository<Player, Long> {

}
