package com.gameListEstudo.dsList.controller;

import com.gameListEstudo.dsList.dto.GameDTO;
import com.gameListEstudo.dsList.dto.GameMinDTO;
import com.gameListEstudo.dsList.entities.Game;
import com.gameListEstudo.dsList.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GamesService gamesService;

    @GetMapping(value = "/{id}")
    public GameDTO findById(@PathVariable long id) {
        GameDTO result = gamesService.findById (id);
        return result;
    }
        @GetMapping
        public List<GameMinDTO> findAll() {
            List<GameMinDTO> result = gamesService.findAll ();
                return result;
            }
        }

