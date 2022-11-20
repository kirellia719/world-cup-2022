package com.worldcup.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.worldcup.demo.model.MatchInfo;
import com.worldcup.demo.model.TeamInfo;

@Entity
@Table(name = "match")
public class MatchEntity {
    @Id
    Integer id;

    @Column
    LocalDate date;

    @Column
    LocalTime time;

    @Column
    String status;

    @ManyToOne
    @JoinColumn(name = "first_team")
    TeamEntity firstTeam;

    @Column
    Integer firstScore;

    @ManyToOne
    @JoinColumn(name = "second_team")
    TeamEntity secondTeam;

    @Column
    Integer secondScore;

    @Column
    String type;

    public MatchEntity() {
    }

    public MatchEntity(Integer id, LocalDate date, LocalTime time, String status, TeamEntity firstTeam,
            Integer firstScore, TeamEntity secondTeam, Integer secondScore, String type) {
        this.id = id;
        this.date = date;
        this.time = time;
        this.status = status;
        this.firstTeam = firstTeam;
        this.firstScore = firstScore;
        this.secondTeam = secondTeam;
        this.secondScore = secondScore;
        this.type = type;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public TeamEntity getFirstTeam() {
        return firstTeam;
    }

    public void setFirstTeam(TeamEntity firstTeam) {
        this.firstTeam = firstTeam;
    }

    public Integer getFirstScore() {
        return firstScore;
    }

    public void setFirstScore(Integer firstScore) {
        this.firstScore = firstScore;
    }

    public TeamEntity getSecondTeam() {
        return secondTeam;
    }

    public void setSecondTeam(TeamEntity secondTeam) {
        this.secondTeam = secondTeam;
    }

    public Integer getSecondScore() {
        return secondScore;
    }

    public void setSecondScore(Integer secondScore) {
        this.secondScore = secondScore;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public MatchInfo toInfo(){
        String group = this.getFirstTeam().getGroup().getName();
        String time = this.getTime().toString();
        TeamInfo firstTeamInfo = new TeamInfo(this.firstTeam.getName(), this.firstTeam.getImg());
        TeamInfo secondTeamInfo = new TeamInfo(this.secondTeam.getName(), this.secondTeam.getImg());
        return new MatchInfo(this.id, group, time, firstTeamInfo, this.firstScore, secondTeamInfo, this.secondScore);
    }
    
}
