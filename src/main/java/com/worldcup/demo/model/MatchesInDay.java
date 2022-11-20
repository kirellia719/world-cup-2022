package com.worldcup.demo.model;

import java.util.List;

public class MatchesInDay {
    String date;
    List<MatchInfo> listMatch;
    public MatchesInDay() {
    }
    public MatchesInDay(String date, List<MatchInfo> listMatch) {
        this.date = date;
        this.listMatch = listMatch;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public List<MatchInfo> getListMatch() {
        return listMatch;
    }
    public void setListMatch(List<MatchInfo> listMatch) {
        this.listMatch = listMatch;
    }
    
    
}
