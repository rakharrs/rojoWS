package com.etu1999.rojows.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.etu1999.rojows.domain.Action;


public interface ActionRepository extends JpaRepository<Action, String> {

    boolean existsByIdIgnoreCase(String id);

}
