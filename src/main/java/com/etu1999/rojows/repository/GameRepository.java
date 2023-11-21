package com.etu1999.rojows.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.etu1999.rojows.domain.Game;


public interface GameRepository extends JpaRepository<Game, String> {

    boolean existsByIdIgnoreCase(String id);

    public List<Game> findBySeason_id(String id_season);
    @Query("select * from game where id_franchise1 = :franchiseId or id_franchise2 = :franchiseId")
    public List<Game> findGameByFranchiseId(@Param("franchiseId") String id_franchise);

    @Query("select * from game where id_franchise1 = :franchiseId")
    public List<Game> findOutsideGameByFranchiseId(@Param("franchiseId") String id_franchise);

    @Query("select * from game where id_franchise2 = :franchiseId")
    public List<Game> findHomeGameByFranchiseId(@Param("franchiseId") String id_franchise);
}
