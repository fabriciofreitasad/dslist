package com.garra.dslist.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garra.dslist.entities.Game;
import com.garra.dslist.projections.GameMinProjection;

public interface GameRepository extends JpaRepository<Game, Long>{
	
	@Query(nativeQuery = true, value = """
			SELECT tb_game.id, tb_game.title, tb_game.game_year AS `year`, tb_game.img_url AS imgUrl,
			tb_game.short_description AS shortDescription, tb_pertence.position
			FROM tb_game
			INNER JOIN tb_pertence ON tb_game.id = tb_pertence.game_id
			WHERE tb_pertence.list_id = :listId
			ORDER BY tb_pertence.position
				""")
	List<GameMinProjection> searchByList(Long listId);

}
