package com.worldcup.demo.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.worldcup.demo.converter.Converter;
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
        String type = "";
        if (this.type.equals("Group")){
            type = "B???ng " + this.firstTeam.getGroup().getName();
        }
        else if (this.type.equals("Round16")){
            type = "V??ng 16 ?????i";
        }
        else if (this.type.equals("Qualifier")){
            type = "V??ng T??? k???t";
        }
        else if (this.type.equals("Semifinal")){
            type = "V??ng B??n k???t";
        }
        else if (this.type.equals("ThirdPlace")){
            type = "Tr???n Tranh ba";
        }
        else if (this.type.equals("Final")){
            type = "Tr???n Chung k???t";
        }
        String time = this.getTime().toString();
        TeamInfo firstTeamInfo = this.firstTeam==null ? null : new TeamInfo (this.firstTeam.getName(), this.firstTeam.getImg());
        TeamInfo secondTeamInfo = this.secondTeam==null ? null : new TeamInfo(this.secondTeam.getName(), this.secondTeam.getImg());
        return new MatchInfo(this.id, type, Converter.dateToString(this.date), time, firstTeamInfo, this.firstScore, secondTeamInfo, this.secondScore, this.status);
    }
    
}
