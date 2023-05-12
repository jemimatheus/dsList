package com.devsuperior.dsList.controllers;

import com.devsuperior.dsList.dto.GameDTO;
import com.devsuperior.dsList.dto.GameListDTO;
import com.devsuperior.dsList.dto.GameMinDTO;
import com.devsuperior.dsList.services.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameListController {

    @Autowired
    private GameService gameService;


    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable  Long id){
        GameDTO result = gameService.findById(id);
        return result;
    }

    @GetMapping
    public List<GameMinDTO> findAll(){
        List<GameMinDTO> result = gameService.findAll();
        return result;
    }


}
