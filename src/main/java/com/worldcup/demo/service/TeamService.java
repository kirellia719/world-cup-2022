package com.worldcup.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldcup.demo.entity.MatchEntity;
import com.worldcup.demo.entity.TeamEntity;
import com.worldcup.demo.model.TeamInRankGroup;
import com.worldcup.demo.model.TeamInfo;
import com.worldcup.demo.repository.MatchRepository;
import com.worldcup.demo.repository.TeamRepository;

@Service
public class TeamService {
    @Autowired
    TeamRepository teamRepository;
    @Autowired
    MatchRepository matchRepository;

    public Object getAllTeam(){
        return teamRepository.findAll();
    }

    public Object getTeamById(Integer id){
        return teamRepository.findOneById(id);
    }

    public TeamInRankGroup getTeamInRankGroup(TeamEntity team){
        List<MatchEntity> listMatch = matchRepository.findMatchOfTeam(team);
        
        TeamInfo info = new TeamInfo(team.getName(), team.getImg());
        Integer numWin = 0;
        Integer numDraw = 0;
        Integer numLose = 0;
        Integer numWinGoal = 0;
        Integer numLoseGoal = 0;
        for (MatchEntity match : listMatch){
            Integer goal;
            Integer beGoal;
            if (team.getId() == match.getFirstTeam().getId()){
                goal = match.getFirstScore();
                beGoal = match.getSecondScore();
            }
            else{
                beGoal = match.getFirstScore();
                goal = match.getSecondScore();
            }
            
            if (goal>beGoal){
                numWin+=1;
            }
            else if (goal==beGoal){
                numDraw+=1;
            }
            else numLose+=1;

            numWinGoal += goal;
            numLoseGoal += beGoal;
        }
        return new TeamInRankGroup(info, numWin, numDraw, numLose, numWinGoal, numLoseGoal);
    }
}
