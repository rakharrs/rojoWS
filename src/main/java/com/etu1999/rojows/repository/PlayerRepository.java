package com.etu1999.rojows.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.etu1999.rojows.domain.Player;


public interface PlayerRepository extends JpaRepository<Player, String> {

    boolean existsByIdIgnoreCase(String id);

    @Query("SELECT p FROM Player p " +
    "JOIN PlayerFranchise pf ON p.id = pf.player.id " +
    "JOIN Franchise f ON f.id = pf.franchise.id " +
    "WHERE f.id = :franchiseId")
    public List<Player> findPlayerByFranchiseId(@Param("franchiseId") String id_franchise);

}
