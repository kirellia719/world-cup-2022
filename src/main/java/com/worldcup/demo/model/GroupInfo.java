package com.worldcup.demo.model;

import java.util.List;

public class GroupInfo {
    Integer id;
    String name;
    List<TeamInfo> listTeam;
    public GroupInfo() {
    }
    public GroupInfo(Integer id, String name, List<TeamInfo> listTeam) {
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
    public List<TeamInfo> getListTeam() {
        return listTeam;
    }
    public void setListTeam(List<TeamInfo> listTeam) {
        this.listTeam = listTeam;
    }

    
}
