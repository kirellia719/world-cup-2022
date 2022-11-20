package com.worldcup.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.worldcup.demo.entity.GroupEntity;

@Repository
public interface GroupRepository extends JpaRepository<GroupEntity, Integer> {
    
}
