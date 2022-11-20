package com.worldcup.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldcup.demo.service.GroupService;

@RestController
public class GroupController {
    @Autowired
    GroupService groupService;

    @GetMapping(value = "/group")
    public Object getAllGroup(){
        return groupService.getAllGroup();
    }
}
