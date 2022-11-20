package com.worldcup.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.worldcup.demo.entity.GroupEntity;
import com.worldcup.demo.entity.TeamEntity;

public interface TeamRepository extends JpaRepository<TeamEntity, Integer>{
    TeamEntity findOneById(Integer id);

    @Query("SELECT t FROM TeamEntity t ORDER BY t.id")
    List<TeamEntity> findAll();

    @Query("SELECT t FROM TeamEntity t WHERE t.group=?1 ORDER BY t.id")
    List<TeamEntity> findByGroup(GroupEntity groupEntity);
}

