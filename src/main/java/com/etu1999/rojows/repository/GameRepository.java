package com.etu1999.rojows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Game;


public interface GameRepository extends JpaRepository<Game, String> {

    boolean existsByIdIgnoreCase(String id);

}
