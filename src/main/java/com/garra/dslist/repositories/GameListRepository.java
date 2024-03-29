package com.garra.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.garra.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
	
	@Modifying
	@Query(nativeQuery = true, 
	value = "UPDATE tb_pertence SET position = :newPosition WHERE list_id = :listId AND game_id = :gameId")
	void updatePertencePosition(Long listId, Long gameId, Integer newPosition);

}
