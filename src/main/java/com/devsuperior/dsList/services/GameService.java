package com.devsuperior.dsList.services;

import com.devsuperior.dsList.dto.GameDTO;
import com.devsuperior.dsList.dto.GameMinDTO;
import com.devsuperior.dsList.entities.Game;
import com.devsuperior.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private  GameRepository gameRepository;

    @Transactional(readOnly = true)
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        GameDTO gameDTO =  new GameDTO(result);
        return gameDTO;
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll(){
      List<Game> result  =  gameRepository.findAll();
        List<GameMinDTO> dto =  result.stream().map(x -> new GameMinDTO(x)).toList();
      return dto;
    }


}
