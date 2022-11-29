package com.worldcup.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldcup.demo.converter.Converter;
import com.worldcup.demo.entity.MatchEntity;
import com.worldcup.demo.model.MatchInfo;
import com.worldcup.demo.model.MatchesInDay;
import com.worldcup.demo.repository.MatchRepository;
import com.worldcup.demo.repository.TeamRepository;

@Service
public class MatchService {
    @Autowired
    MatchRepository matchRepository;

    @Autowired
    TeamRepository teamRepository;


    public List<MatchesInDay> getAllMatch(){
        List<MatchesInDay> allMatches = new ArrayList<>();
        allMatches.addAll(this.getAllMatchByType("Group"));
        allMatches.addAll(this.getAllMatchByType("Round16"));
        allMatches.addAll(this.getAllMatchByType("Qualifier"));
        allMatches.addAll(this.getAllMatchByType("Semifinal"));
        allMatches.addAll(this.getAllMatchByType("ThirdPlace"));
        allMatches.addAll(this.getAllMatchByType("Final"));
        return allMatches;
    }

    public List<MatchesInDay> getAllMatchByType(String type){
        List<LocalDate> listDate = matchRepository.findDate(type);
        List<MatchesInDay> matches = new ArrayList<>();
        for (LocalDate date: listDate){
            matches.add(new MatchesInDay(Converter.dateToString(date), this.getMatchByDay(date, type)));
        }
        return matches;
    }

    public List<MatchInfo> getMatchByDay(LocalDate date, String type){
        List<MatchEntity> listMatchEntities = matchRepository.findByDate(date, type);
        List<MatchInfo> matchInfos = new ArrayList<>();
        for (MatchEntity matchEntity: listMatchEntities){
            matchInfos.add(matchEntity.toInfo());
        }
        return matchInfos;
    }

    public Object getPlayInMatch(){
        return null;
    }

    public Object getPlayInMatchByType(String type){
        List<MatchEntity> listMatchEntity = matchRepository.findByType(type);
        List<MatchInfo> listMatchInfo = new ArrayList<>();
        for (MatchEntity matchEntity: listMatchEntity){
            listMatchInfo.add(matchEntity.toInfo());
        }
        return listMatchInfo;
    }

    public Object insertMatch(){
        return null;
    }
}
