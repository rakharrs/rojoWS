package com.etu1999.rojows.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Game {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_franchise1")
    private Franchise franchise1;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_franchise2")
    private Franchise franchise2;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_season", nullable = false)
    private Season season;

    @OneToMany(mappedBy = "game")
    private List<Statistics> gameStatisticses;

}
