package com.etu1999.rojows.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.sql.Date;
import java.time.LocalTime;
import java.util.List;
import java.util.Set;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Player {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(name = "last_name", nullable = false, length = 50)
    private String lastName;

    @Column(name = "first_name", nullable = false, length = 50)
    private String firstName;

    @Column(nullable = false)
    private Date birthdate;

    @OneToMany(mappedBy = "player")
    private List<PlayerFranchise> playerPlayerFranchis;

}
