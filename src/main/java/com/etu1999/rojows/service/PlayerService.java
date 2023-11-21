package com.etu1999.rojows.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Franchise;
import com.etu1999.rojows.domain.Game;
import com.etu1999.rojows.domain.Player;
import com.etu1999.rojows.repository.GameRepository;
import com.etu1999.rojows.repository.PlayerRepository;
import com.etu1999.rojows.stats.GlobalStatistic;
import com.etu1999.rojows.stats.PlayerStatistic;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;
    private final GameService gameService;

    PlayerService(PlayerRepository playerRepository, GameService gameService){
        this.playerRepository = playerRepository;
        this.gameService = gameService;
    }

    public List<Player> findPlayerByFranchiseId(String id){
        return playerRepository.findPlayerByFranchiseId(id);
    }

    public PlayerStatistic getStatByGameByPlayer(String id_game, String id_player){
        Game game = gameService.findById(id_game);
        Franchise franchise1 = game.getFranchise1();
        Franchise franchise2 = game.getFranchise2();
        Player player = getPlayer(franchise1.getPlayers(), id_player);
        player = (player != null) ? null : getPlayer(franchise2.getPlayers(), id_player);
        if (player != null)
            return player.getStatistic();
        return null;
    }

    public Player getPlayer(List<Player> players, String id_player){
        for (Player player : players) {
            if(player.getId().equals(id_player))
                return player;
        }return null;
    }
}
