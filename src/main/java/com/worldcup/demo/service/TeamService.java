package com.worldcup.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldcup.demo.repository.TeamRepository;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;

    public Object getAllTeam(){
        return teamRepository.findAll();
    }

    public Object getTeamById(Integer id){
        return teamRepository.findOneById(id);
    }
}
