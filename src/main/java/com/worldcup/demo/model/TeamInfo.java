package com.worldcup.demo.model;

public class TeamInfo {
    String name;
    String img;
    public TeamInfo() {
    }
    public TeamInfo(String name, String img) {
        this.name = name;
        this.img = img;
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
}
