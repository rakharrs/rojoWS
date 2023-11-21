package com.etu1999.rojows.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Statistics;


public interface StatisticsRepository extends JpaRepository<Statistics, String> {

    boolean existsByIdIgnoreCase(String id);

    public List<Statistics> findByGame_Id(String game_id);
    public List<Statistics> findByPlayer_IdAndGame_Id(String player_id, String game_id);
}
