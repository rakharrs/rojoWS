package com.etu1999.rojows.service;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Season;
import com.etu1999.rojows.repository.SeasonRepository;

@Service
public class SeasonService {
    private final SeasonRepository seasonRepository;

    SeasonService(final SeasonRepository seasonRepository){
        this.seasonRepository = seasonRepository;
    }

    public Season findById(String id){
        return seasonRepository.findById(id).get();
    }
}
