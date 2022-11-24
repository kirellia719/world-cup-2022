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
        return matchService.getAllMatch("Group");
    }

    @GetMapping(value = "/round-16")
    public Object getRound16Match(){
        return matchService.getAllMatch("1/16");
    }

    @GetMapping(value = "/qualifier")
    public Object getQualifierMatch(){
        return matchService.getAllMatch("Qualifier");
    }

    @GetMapping(value = "/semifinal")
    public Object getSemifinalMatch(){
        return matchService.getAllMatch("Semifinal");
    }

    @GetMapping(value = "/third-place")
    public Object getThirdPlaceMatch(){
        return matchService.getAllMatch("ThirdPlace");
    }

    @GetMapping(value = "/final")
    public Object getFinalMatch(){
        return matchService.getAllMatch("Final");
    }

    @GetMapping(value = "/insert")
    public Object insertMatch(){
        return matchService.insertMatch();
    }
}
