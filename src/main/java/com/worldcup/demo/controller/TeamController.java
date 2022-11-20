package com.worldcup.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldcup.demo.service.TeamService;

@RestController
@CrossOrigin
@RequestMapping(value = "team")
public class TeamController {
    @Autowired
    TeamService teamService;

    @GetMapping
    public Object getAllTeam(){
        return teamService.getAllTeam();
    }

    @GetMapping(value = "/{id}")
    public Object getTeam(@PathVariable Integer id){
        return teamService.getTeamById(id);
    }

}
