package com.worldcup.demo.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.worldcup.demo.entity.MatchEntity;
import com.worldcup.demo.entity.TeamEntity;

@Repository
public interface MatchRepository extends JpaRepository<MatchEntity, Integer>{
    @Query("SELECT m FROM MatchEntity m WHERE m.date=?1 ORDER BY m.id")
    List<MatchEntity> findByDate(LocalDate date);

    @Query("SELECT DISTINCT m.date FROM MatchEntity m ORDER BY m.date")
    List<LocalDate> findDate();

    @Query("SELECT m FROM MatchEntity m WHERE m.status='Complete' AND m.type='Group' AND (m.firstTeam=?1 OR m.secondTeam=?1) ORDER BY m.id")
    List<MatchEntity> findMatchOfTeam(TeamEntity team);
}
