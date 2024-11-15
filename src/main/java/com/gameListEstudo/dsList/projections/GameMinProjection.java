package com.gameListEstudo.dsList.projections;

import com.gameListEstudo.dsList.entities.Belonging;

public interface GameMinProjection {

    Long getId();
    String getTitle();
    Integer getYear();
    String getImgUrl();
    String getShortDescription();
    Integer getPosition();
}
