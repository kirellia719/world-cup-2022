package com.worldcup.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldcup.demo.repository.GroupRepository;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    public Object getAllGroup(){
        return groupRepository.findAll();
    }
}
