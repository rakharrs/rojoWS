package com.etu1999.rojows.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.etu1999.rojows.domain.Action;
import com.etu1999.rojows.repository.ActionRepository;

@Service
public class ActionService {
    private final ActionRepository actionRepository;

    public ActionService(ActionRepository actionRepository){
        this.actionRepository = actionRepository;
    }

    public List<Action> findAll(){
        return actionRepository.findAll();
    }
}
