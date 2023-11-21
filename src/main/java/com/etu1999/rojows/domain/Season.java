package com.etu1999.rojows.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Season {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(name = "type_season", length = 50)
    private String typeSeason;

    @Column(name = "season_debut", nullable = false)
    private Date seasonDebut;

    @Column(name = "season_end",  nullable = false)
    private Date seasonEnd;

    @OneToMany(mappedBy = "season")
    private List<Game> saisonGames;

}
