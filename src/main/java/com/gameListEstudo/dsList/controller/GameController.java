package com.gameListEstudo.dsList.controller;

import com.gameListEstudo.dsList.dto.GameMinDTO;
import com.gameListEstudo.dsList.entities.Game;
import com.gameListEstudo.dsList.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/games")
public class GameController {

    @Autowired
    private GamesService gamesService;
        @GetMapping
        public List<GameMinDTO> findAll() {
            List<GameMinDTO> result = gamesService.findAll ();
                return result;
            }
        }

