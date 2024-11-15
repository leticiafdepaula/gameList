package com.gameListEstudo.dsList.controller;

import com.gameListEstudo.dsList.dto.GameListDTO;
import com.gameListEstudo.dsList.dto.GameMinDTO;
import com.gameListEstudo.dsList.service.GameListService;
import com.gameListEstudo.dsList.service.GamesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
@RequestMapping(value = "/lists")
public class GameListController {

    @Autowired
    private GameListService gameListService;
    @Autowired
    private GamesService gamesService;

    @GetMapping
    public List<GameListDTO> findAll() {
        List<GameListDTO> result = gameListService.findAll ();
        return result;
    }
    @GetMapping(value = "/{listId}/games")
    public List<GameMinDTO> findByList(@PathVariable Long listId) {
        List<GameMinDTO> result = gamesService.findByList (listId);
        return result;
    }
}
