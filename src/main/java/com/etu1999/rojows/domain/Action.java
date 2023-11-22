package com.etu1999.rojows.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Action {

    @Id
    @Column(nullable = false, updatable = false, length = 50)
    private String id;

    @Column(length = 50)
    private String actionName;

}
