package com.worldcup.demo.model;

public class MatchInfo {
    String group;
    String Time;
    TeamInfo firstTeam;
    TeamInfo secondTeam;
    public MatchInfo() {
    }
    public MatchInfo(String group, String time, TeamInfo firstTeam, TeamInfo secondTeam) {
        this.group = group;
        Time = time;
        this.firstTeam = firstTeam;
        this.secondTeam = secondTeam;
    }
    public String getGroup() {
        return group;
    }
    public void setGroup(String group) {
        this.group = group;
    }
    public String getTime() {
        return Time;
    }
    public void setTime(String time) {
        Time = time;
    }
    public TeamInfo getFirstTeam() {
        return firstTeam;
    }
    public void setFirstTeam(TeamInfo firstTeam) {
        this.firstTeam = firstTeam;
    }
    public TeamInfo getSecondTeam() {
        return secondTeam;
    }
    public void setSecondTeam(TeamInfo secondTeam) {
        this.secondTeam = secondTeam;
    }
    
    
}
