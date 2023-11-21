package com.etu1999.rojows.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Statistics;
import com.etu1999.rojows.repository.StatisticsRepository;

@Service
public class StatisticService {
    private final StatisticsRepository statisticsRepository;

    public StatisticService(final StatisticsRepository statisticsRepository){
        this.statisticsRepository = statisticsRepository;
    }

    public List<Statistics> getStatisticsByPlayerByGame(String id_player, String id_game){
        return statisticsRepository.findByPlayer_IdAndGame_Id(id_player, id_game);
    }
}
