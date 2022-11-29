package com.worldcup.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldcup.demo.service.MatchService;

@RestController
@CrossOrigin
@RequestMapping(value = "/match")
public class MatchController {
    @Autowired
    MatchService matchService;

    @GetMapping
    public Object getAllMatch(){
        return matchService.getAllMatch();
    }

    @GetMapping(value = "/group")
    public Object getAllGroupMatch(){
        return matchService.getAllMatchByType("Group");
    }

    @GetMapping(value = "/round-16")
    public Object getRound16Match(){
        return matchService.getPlayInMatchByType("Round16");
    }

    @GetMapping(value = "/qualifier")
    public Object getQualifierMatch(){
        return matchService.getPlayInMatchByType("Qualifier");
    }

    @GetMapping(value = "/semifinal")
    public Object getSemifinalMatch(){
        return matchService.getPlayInMatchByType("Semifinal");
    }

    @GetMapping(value = "/third-place")
    public Object getThirdPlaceMatch(){
        return matchService.getPlayInMatchByType("ThirdPlace");
    }

    @GetMapping(value = "/final")
    public Object getFinalMatch(){
        return matchService.getPlayInMatchByType("Final");
    }

    @GetMapping(value = "/insert")
    public Object insertMatch(){
        return matchService.insertMatch();
    }
}
