package com.etu1999.rojows.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Franchise;
import com.etu1999.rojows.domain.Game;
import com.etu1999.rojows.domain.Player;
import com.etu1999.rojows.repository.FranchiseRepository;
import com.etu1999.rojows.repository.GameRepository;

@Service
public class FranchiseService {
    private final FranchiseRepository franchiseRepository;
    private final GameRepository gameRepository;

    public FranchiseService(final FranchiseRepository franchiseRepository, final GameRepository gameRepository) {
        this.franchiseRepository = franchiseRepository;
        this.gameRepository = gameRepository;
    }

    public List<Franchise> findAll(){
        return franchiseRepository.findAll();
    }

    public List<Player> getPlayers(String id){
        return franchiseRepository.findPlayerByFranchiseId(id);
    }

    public List<Game> findHomeGameByFranchiseId(String id_franchise){
        return gameRepository.findHomeGameByFranchiseId(id_franchise);
    }

    public List<Game> findOutsideGameByFranchiseId(String id_franchise){
        return gameRepository.findOutsideGameByFranchiseId(id_franchise);
    }
}
