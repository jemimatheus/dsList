package com.devsuperior.dsList.repositories;

import com.devsuperior.dsList.entities.Game;
import com.devsuperior.dsList.projections.GameMinProjection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GameRepository extends JpaRepository<Game,Long> {

    @Query(nativeQuery = true, value = """
SELECT tb_game.id,tb_game.titulo, tb_game.ano,tb_game.img_url, tb_game.desc_curta, tb_game.desc_longa, tb_belonging.position
FROM tb_game
INNER JOIN tb_belonging ON tb_game.id = tb_belonging.game_id
WHERE tb_belonging.list_id =  : listId
ORDER BY tb_belonging.position 
""")
    List<GameMinProjection> searchByList(Long listId);




}

