package com.etu1999.rojows.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etu1999.rojows.domain.Game;
import com.etu1999.rojows.service.GameService;

@RestController
@RequestMapping("/games")
public class GameController {
    private final GameService service;
    public GameController(final GameService gameService){
        this.service = gameService;
    }

    @GetMapping
    public ResponseEntity<List<Game>> list(){
        return ResponseEntity.ok(service.findAll());
    }

    @GetMapping("/season/{id_season}")
    public ResponseEntity<List<Game>> listBySeason(@PathVariable String id_season){
        return ResponseEntity.ok(service.findBySeason(id_season));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Game> getGame(@PathVariable String id){
        return ResponseEntity.ok(service.findById(id));
    }
}
