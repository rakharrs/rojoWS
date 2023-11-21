package com.etu1999.rojows.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import java.time.LocalDate;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class PlayerFranchise {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(name = "date_arrivee", nullable = false)
    private LocalDate dateArrivee;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_player")
    private Player player;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_franchise", nullable = false)
    private Franchise franchise;
}
