package com.worldcup.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "`team`")
public class TeamEntity {
    @Id
    Integer id;

    @Column
    String name;

    @ManyToOne
    @JoinColumn(name = "group_id")
    GroupEntity group;

    @Column
    String img;

    public TeamEntity() {
    }

    public TeamEntity(Integer id, String name, GroupEntity group, String img) {
        this.id = id;
        this.name = name;
        this.group = group;
        this.img = img;
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

    public GroupEntity getGroupEntity() {
        return group;
    }

    public void setGroupEntity(GroupEntity group) {
        this.group = group;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    
    
}
