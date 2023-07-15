package com.garra.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garra.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	

}
