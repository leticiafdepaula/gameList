package com.gameListEstudo.dsList.repositories;

import com.gameListEstudo.dsList.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {


}
