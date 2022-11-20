package com.worldcup.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.worldcup.demo.entity.TeamEntity;

public interface TeamRepository extends JpaRepository<TeamEntity, Integer>{
    TeamEntity findOneById(Integer id);
}

