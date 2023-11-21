package com.etu1999.rojows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Statistics;


public interface StatisticsRepository extends JpaRepository<Statistics, String> {

    boolean existsByIdIgnoreCase(String id);

}
