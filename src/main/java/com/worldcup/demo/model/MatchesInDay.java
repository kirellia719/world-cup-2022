package com.worldcup.demo.model;

import java.time.LocalDate;
import java.util.List;

public class MatchesInDay {
    LocalDate date;
    List<MatchInfo> listMatch;
    public MatchesInDay() {
    }
    public MatchesInDay(LocalDate date, List<MatchInfo> listMatch) {
        this.date = date;
        this.listMatch = listMatch;
    }
    public LocalDate getDate() {
        return date;
    }
    public void setDate(LocalDate date) {
        this.date = date;
    }
    public List<MatchInfo> getListMatch() {
        return listMatch;
    }
    public void setListMatch(List<MatchInfo> listMatch) {
        this.listMatch = listMatch;
    }
    
    
}
