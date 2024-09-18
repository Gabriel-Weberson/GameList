package com.projects.gamesList.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.projects.gamesList.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
}
