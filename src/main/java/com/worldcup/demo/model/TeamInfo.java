package com.worldcup.demo.model;

public class TeamInfo {
    String name;
    String img;
    Integer score;
    public TeamInfo() {
    }
    public TeamInfo(String name, String img, Integer score) {
        this.name = name;
        this.img = img;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getImg() {
        return img;
    }
    public void setImg(String img) {
        this.img = img;
    }
    public Integer getScore() {
        return score;
    }
    public void setScore(Integer score) {
        this.score = score;
    }

    
}
