package com.etu1999.rojows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Player;


public interface PlayerRepository extends JpaRepository<Player, String> {

    boolean existsByIdIgnoreCase(String id);

}
