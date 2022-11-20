package com.worldcup.demo.model;

public class TeamInRankGroup {
    TeamInfo info;
    Integer numMatch;
    Integer numWin;
    Integer numDraw;
    Integer numLose;
    Integer numWinGoal;
    Integer numLoseGoal;
    Integer deltaGoal;
    Integer score;
    public TeamInRankGroup() {
    }
    public TeamInRankGroup(TeamInfo info, Integer numWin, Integer numDraw, Integer numLose,
            Integer numWinGoal, Integer numLoseGoal) {
        this.info = info;
        this.numMatch = numWin + numDraw + numLose;
        this.numWin = numWin;
        this.numDraw = numDraw;
        this.numLose = numLose;
        this.numWinGoal = numWinGoal;
        this.numLoseGoal = numLoseGoal;
        this.deltaGoal = numWinGoal - numLoseGoal;
        this.score = numWin*3 + numDraw;
    }
    public TeamInfo getInfo() {
        return info;
    }
    public void setInfo(TeamInfo info) {
        this.info = info;
    }
    public Integer getNumMatch() {
        return numMatch;
    }
    public void setNumMatch(Integer numMatch) {
        this.numMatch = numMatch;
    }
    public Integer getNumWin() {
        return numWin;
    }
    public void setNumWin(Integer numWin) {
        this.numWin = numWin;
    }
    public Integer getNumDraw() {
        return numDraw;
    }
    public void setNumDraw(Integer numDraw) {
        this.numDraw = numDraw;
    }
    public Integer getNumLose() {
        return numLose;
    }
    public void setNumLose(Integer numLose) {
        this.numLose = numLose;
    }
    public Integer getNumWinGoal() {
        return numWinGoal;
    }
    public void setNumWinGoal(Integer numWinGoal) {
        this.numWinGoal = numWinGoal;
    }
    public Integer getNumLoseGoal() {
        return numLoseGoal;
    }
    public void setNumLoseGoal(Integer numLoseGoal) {
        this.numLoseGoal = numLoseGoal;
    }
    public Integer getDeltaGoal() {
        return deltaGoal;
    }
    public void setDeltaGoal(Integer deltaGoal) {
        this.deltaGoal = deltaGoal;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }

    public Integer compareTo(TeamInRankGroup otherTeam){
        Integer otherScore = otherTeam.getScore();
        return (this.score).compareTo(otherScore);
    }

}
