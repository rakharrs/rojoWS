package com.etu1999.rojows.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etu1999.rojows.domain.Player;
import com.etu1999.rojows.service.PlayerService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping("/players")
public class PlayerController {
    
    private final PlayerService playerService;

    PlayerController(PlayerService playerService){
        this.playerService = playerService;
    }

    @GetMapping("/franchise/{id_franchise}")
    public ResponseEntity<List<Player>> findByFranchise(@PathVariable String id_franchise){
        return ResponseEntity.ok(playerService.findPlayerByFranchiseId(id_franchise));
    }
}
