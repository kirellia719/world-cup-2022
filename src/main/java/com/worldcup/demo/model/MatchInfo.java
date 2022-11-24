package com.worldcup.demo.model;

public class MatchInfo {
    Integer id;
    String type;
    String time;
    TeamInfo firstTeam;
    Integer firstScore;
    TeamInfo secondTeam;
    Integer secondScore;
    String status;

    public MatchInfo() {
    }

    public MatchInfo(Integer id, String type, String time, TeamInfo firstTeam, Integer firstScore, TeamInfo secondTeam,
            Integer secondScore, String status) {
        this.id = id;
        this.type = type;
        this.time = time;
        this.firstTeam = firstTeam;
        this.firstScore = firstScore;
        this.secondTeam = secondTeam;
        this.secondScore = secondScore;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
}
