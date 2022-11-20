package com.worldcup.demo.model;

public class MatchInfo {
    Integer id;
    String group;
    String time;
    TeamInfo firstTeam;
    Integer firstScore;
    TeamInfo secondTeam;
    Integer secondScore;

    public MatchInfo() {
    }

    public MatchInfo(Integer id, String group, String time, TeamInfo firstTeam, Integer firstScore, TeamInfo secondTeam,
            Integer secondScore) {
        this.id = id;
        this.group = group;
        this.time = time;
        this.firstTeam = firstTeam;
        this.firstScore = firstScore;
        this.secondTeam = secondTeam;
        this.secondScore = secondScore;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public TeamInfo getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(TeamInfo firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Integer getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(Integer firstScore) {
        this.firstScore = firstScore;
    }

    public TeamInfo getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(TeamInfo secondTeam) {
        this.secondTeam = secondTeam;
    }

    public Integer getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(Integer secondScore) {
        this.secondScore = secondScore;
    }
    
    
    
}
