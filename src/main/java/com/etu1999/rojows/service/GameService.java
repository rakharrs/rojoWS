package com.etu1999.rojows.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Franchise;
import com.etu1999.rojows.domain.Game;
import com.etu1999.rojows.domain.Player;
import com.etu1999.rojows.domain.Statistics;
import com.etu1999.rojows.repository.GameRepository;
import com.etu1999.rojows.stats.PlayerStatistic;

@Service
public class GameService {
    private final GameRepository gameRepository;
    private final FranchiseService franchiseService;
    private final StatisticService statisticService;

    GameService(GameRepository gameRepository, FranchiseService franchiseService, StatisticService statisticService){
        this.gameRepository = gameRepository;
        this.franchiseService = franchiseService;
        this.statisticService = statisticService;
    }

    public List<Game> findAll(){
        List<Game> first_result = gameRepository.findAll();
        initGamesStat(first_result);
        return first_result;
    }

    public Game findById(String id){
        return initGameStat(gameRepository.findById(id).get());
    }

    protected Game initGameStat(Game game){
        Franchise franchise1 = game.getFranchise1();
        Franchise franchise2 = game.getFranchise2();
        franchise1.setPlayers(franchiseService.getPlayers(franchise1.getId()));
        franchise2.setPlayers(franchiseService.getPlayers(franchise2.getId()));
        for (Player player : franchise1.getPlayers()) {
            List<Statistics> base_stats = statisticService.getStatisticsByPlayerByGame(player.getId(), game.getId());
            player.setStatistic(PlayerStatistic.createAttribute(base_stats));
        }
        for (Player player : franchise2.getPlayers()) {
            List<Statistics> base_stats = statisticService.getStatisticsByPlayerByGame(player.getId(), game.getId());
            player.setStatistic(PlayerStatistic.createAttribute(base_stats));
        }
        return game;
    }

    protected List<Game> initGamesStat(List<Game> games){
        for (Game game : games)
            initGameStat(game);
        return games;
    }

    public List<Game> findGameByFranchiseId(String id_franchise){
        return gameRepository.findGameByFranchiseId(id_franchise);
    }

    public List<Game> findBySeason(String id_season){
        return gameRepository.findBySeason_id(id_season);
    }

    public List<Game> findHomeGameByFranchiseId(String id_franchise){
        return initGamesStat(gameRepository.findHomeGameByFranchiseId(id_franchise));
    }

    public List<Game> findOutsideGameByFranchiseId(String id_franchise){
        return initGamesStat(gameRepository.findOutsideGameByFranchiseId(id_franchise));
    }
}
