package com.etu1999.rojows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Season;


public interface SeasonRepository extends JpaRepository<Season, String> {

    boolean existsByIdIgnoreCase(String id);

}
