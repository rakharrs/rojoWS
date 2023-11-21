package com.etu1999.rojows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.PlayerFranchise;


public interface PlayerFranchiseRepository extends JpaRepository<PlayerFranchise, String> {

    boolean existsByIdIgnoreCase(String id);

}
