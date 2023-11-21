package com.etu1999.rojows.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.etu1999.rojows.domain.Franchise;
import com.etu1999.rojows.service.FranchiseService;

@RestController
@RequestMapping("/franchises")
public class FranchiseController {
    private final FranchiseService franchiseService;

    FranchiseController(final FranchiseService franchiseService){
        this.franchiseService = franchiseService;
    }

    @GetMapping
    public ResponseEntity<List<Franchise>> findAll(){
        return ResponseEntity.ok(franchiseService.findAll());
    }

}
