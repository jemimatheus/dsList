package com.devsuperior.dsList.controllers;

import com.devsuperior.dsList.dto.GameDTO;
import com.devsuperior.dsList.dto.GameListDTO;
import com.devsuperior.dsList.dto.GameMinDTO;
import com.devsuperior.dsList.entities.Game;
import com.devsuperior.dsList.services.GameListService;
import com.devsuperior.dsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GameListService gameListService;



    @GetMapping(value = "/lists")
    public List<GameListDTO> findByAll(){
        List <GameListDTO> result = gameListService.finAll();
        return result;
    }

}
