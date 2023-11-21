package com.etu1999.rojows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Franchise;


public interface FranchiseRepository extends JpaRepository<Franchise, String> {

    boolean existsByIdIgnoreCase(String id);
}
