package com.etu1999.rojows.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etu1999.rojows.domain.Action;
import com.etu1999.rojows.service.ActionService;


@RestController
@RequestMapping("/actions")
public class ActionController {
    private final ActionService actionService;
    ActionController(final ActionService actionService){
        this.actionService = actionService;
    }

    @GetMapping
    public ResponseEntity<List<Action>> findAll(){
        return ResponseEntity.ok(actionService.findAll());
    }
}
