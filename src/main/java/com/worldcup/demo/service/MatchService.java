package com.worldcup.demo.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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

    public Object getAllMatch(){
        List<LocalDate> listDate = matchRepository.findDate();
        List<MatchesInDay> matches = new ArrayList<>();
        for (LocalDate date: listDate){
            matches.add(new MatchesInDay(date, this.getMatchByDay(date)));
        }
        return matches;
    }

    public List<MatchInfo> getMatchByDay(LocalDate date){
        List<MatchEntity> listMatchEntities = matchRepository.findByDate(date);
        List<MatchInfo> matchInfos = new ArrayList<>();
        for (MatchEntity matchEntity: listMatchEntities){
            matchInfos.add(matchEntity.toInfo());
        }
        return matchInfos;
    }

    public Object insertMatch(){
        return null;
    }
}
