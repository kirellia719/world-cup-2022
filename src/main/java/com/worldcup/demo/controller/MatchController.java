package com.worldcup.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldcup.demo.service.MatchService;

@RestController
@RequestMapping(value = "/match")
public class MatchController {
    @Autowired
    MatchService matchService;

    @GetMapping
    public Object getAllMatch(){
        return matchService.getAllMatch();
    }

    @GetMapping(value = "/insert")
    public Object insertMatch(){
        return matchService.insertMatch();
    }
}
