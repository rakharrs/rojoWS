package com.etu1999.rojows.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Player;
import com.etu1999.rojows.repository.PlayerRepository;

@Service
public class PlayerService {
    private final PlayerRepository playerRepository;

    PlayerService(PlayerRepository playerRepository){
        this.playerRepository = playerRepository;
    }

        public List<Player> findPlayerByFranchiseId(String id){
        return playerRepository.findPlayerByFranchiseId(id);
    }
}
