package com.garra.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garra.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	

}
