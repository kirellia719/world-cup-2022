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

    String dateToString(LocalDate date){
        Integer dayInWeek = date.getDayOfWeek().getValue();
        String dateString = "";
            switch (dayInWeek) {
                case 1:
                    dateString += "Th 2";
                    break;
                case 2:
                    dateString += "Th 3";
                    break;
                case 3:
                    dateString += "Th 4";
                    break;
                case 4:
                    dateString += "Th 5";
                    break;
                case 5:
                    dateString += "Th 6";
                    break;
                case 6:
                    dateString += "Th 7";
                    break;
                default:
                    dateString += "CN";
                    break;
            }
            dateString += ", " + date.getDayOfMonth() + "/" + date.getMonthValue();
            return dateString;
    }

    public Object getAllMatch(String type){
        List<LocalDate> listDate = matchRepository.findDate(type);
        List<MatchesInDay> matches = new ArrayList<>();
        for (LocalDate date: listDate){
            matches.add(new MatchesInDay(dateToString(date), this.getMatchByDay(date, type)));
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

    public Object insertMatch(){
        return null;
    }
}
