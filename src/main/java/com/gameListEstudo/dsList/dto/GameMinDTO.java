package com.gameListEstudo.dsList.dto;

import com.gameListEstudo.dsList.entities.Game;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String title;
    private Integer year;
    private String imgUrl;
    private String shortDescription;

    public GameMinDTO() {
    }
    public GameMinDTO(Game entity) {
        Id = entity.getId ();
        title = entity.getTitle ();
        year = entity.getYear ();
        imgUrl= entity.getImgUrl ();
        shortDescription= entity.getShortDescription ();
    }
    public Long getId() {
        return Id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getYear() {
        return year;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
