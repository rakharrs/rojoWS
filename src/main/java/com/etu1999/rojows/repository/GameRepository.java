package com.etu1999.rojows.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Game;


public interface GameRepository extends JpaRepository<Game, String> {

    boolean existsByIdIgnoreCase(String id);

    public List<Game> findBySeason_id(String id_season);

}
