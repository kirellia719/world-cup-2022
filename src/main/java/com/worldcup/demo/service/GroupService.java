package com.worldcup.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.worldcup.demo.entity.GroupEntity;
import com.worldcup.demo.entity.TeamEntity;
import com.worldcup.demo.model.GroupInfo;
import com.worldcup.demo.model.TeamInRankGroup;
import com.worldcup.demo.model.TeamInfo;
import com.worldcup.demo.repository.GroupRepository;
import com.worldcup.demo.repository.TeamRepository;

@Service
public class GroupService {
    @Autowired
    GroupRepository groupRepository;

    @Autowired
    TeamRepository teamRepository;

    @Autowired
    TeamService teamService;

    public Object getAllGroup(){
        List<GroupEntity> listGroup = groupRepository.findAll();
        List<GroupInfo> listGroupInfo = new ArrayList<>();
        for (GroupEntity group : listGroup){
            List<TeamEntity> listTeam = teamRepository.findByGroup(group);
            List<TeamInfo> listTeamInfo = new ArrayList<>();
            for (TeamEntity teamEntity : listTeam)
                listTeamInfo.add(new TeamInfo(teamEntity.getName(), teamEntity.getImg()));
            listGroupInfo.add(new GroupInfo(group.getId(), group.getName(), listTeamInfo));
        }
        return listGroupInfo;
        
    }

    public Object getGroupInfo(Integer groupId){
        GroupEntity group = groupRepository.findById(groupId).get();
        List<TeamEntity> listTeam = teamRepository.findByGroup(group);
        List<TeamInRankGroup> groupInfo = new ArrayList<>();

        for (TeamEntity team : listTeam){
            groupInfo.add(
                teamService.getTeamInRankGroup(team)
            );
        }

        Integer size = groupInfo.size(); 
        for (Integer i=0; i<size-1; i++) {
            for (Integer j=i+1; j<size; j++){
                TeamInRankGroup team1 = groupInfo.get(i);
                TeamInRankGroup team2 = groupInfo.get(j);
                if (team1.getScore() < team2.getScore()) {
                    groupInfo.set(i, team2);
                    groupInfo.set(j, team1);
                }
                else if (team1.getScore()==team2.getScore()){
                    if (team1.getDeltaGoal()<team2.getDeltaGoal()){
                        groupInfo.set(i, team2);
                        groupInfo.set(j, team1);
                    }
                }
            }
        }

        return groupInfo;
    }
}
