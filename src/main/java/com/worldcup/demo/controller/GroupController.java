package com.worldcup.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.worldcup.demo.service.GroupService;

@RestController
@CrossOrigin
@RequestMapping(value = "/group")
public class GroupController {
    @Autowired
    GroupService groupService;

    @GetMapping
    public Object getAllGroup(){
        return groupService.getAllGroup();
    }
}
