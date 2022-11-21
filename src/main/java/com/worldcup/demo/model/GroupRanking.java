package com.worldcup.demo.model;

import java.util.List;

public class GroupRanking {
    Integer id;
    String name;
    List<TeamInRankGroup> listTeam;
    public GroupRanking() {
    }
    public GroupRanking(Integer id, String name, List<TeamInRankGroup> listTeam) {
        this.id = id;
        this.name = name;
        this.listTeam = listTeam;
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public List<TeamInRankGroup> getListTeam() {
        return listTeam;
    }
    public void setListTeam(List<TeamInRankGroup> listTeam) {
        this.listTeam = listTeam;
    }
    
}
