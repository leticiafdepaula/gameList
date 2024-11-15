package com.gameListEstudo.dsList.service;

import com.gameListEstudo.dsList.dto.GameDTO;
import com.gameListEstudo.dsList.dto.GameMinDTO;
import com.gameListEstudo.dsList.entities.Game;
import com.gameListEstudo.dsList.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GamesService {
    @Autowired
    private GameRepository gameRepository;
        @Transactional(readOnly = true)
        public GameDTO findById(Long id){
        Game result = gameRepository.findById (id).get ();
        return new GameDTO (result);
    }
      @Transactional(readOnly = true)
      public List<GameMinDTO> findAll() {
       List<Game> result = gameRepository.findAll ();
       return result.stream ().map (x -> new GameMinDTO (x)).toList ();
    }
}
