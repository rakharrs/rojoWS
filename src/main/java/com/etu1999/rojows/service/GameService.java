package com.etu1999.rojows.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Game;
import com.etu1999.rojows.repository.GameRepository;

@Service
public class GameService {
    private final GameRepository gameRepository;

    GameService(GameRepository gameRepository){
        this.gameRepository = gameRepository;
    }

    public List<Game> findAll(){
        return gameRepository.findAll();
    }
}
