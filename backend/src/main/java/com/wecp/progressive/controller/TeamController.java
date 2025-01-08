package com.wecp.progressive.controller;
<<<<<<< HEAD

import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.impl.TeamServiceImplArraylist;
import com.wecp.progressive.service.impl.TeamServiceImplJpa;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLException;
import java.util.List;

@RestController
@RequestMapping("/team")
public class TeamController {

    @Autowired
    TeamServiceImplArraylist teamServiceImplArraylist;

    @Autowired
    TeamServiceImplJpa teamServiceImplJpa;

    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams() {
        try {
            List<Team> teamList = teamServiceImplJpa.getAllTeams();
            return new ResponseEntity<>(teamList, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{teamId}")
    public ResponseEntity<Team> getTeamById(@PathVariable int teamId) {
        try {
            Team team = teamServiceImplJpa.getTeamById(teamId);
            return new ResponseEntity<>(team, HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping
    public ResponseEntity<Integer> addTeam(@RequestBody Team team) {
        try {
            int teamId = teamServiceImplJpa.addTeam(team);
            return new ResponseEntity<>(teamId, HttpStatus.CREATED);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PutMapping("/{teamId}")
    public ResponseEntity<Void> updateTeam(@PathVariable int teamId, @RequestBody Team team) {
        try {
            team.setTeamId(teamId);
            teamServiceImplJpa.updateTeam(team);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @DeleteMapping("/{teamId}")
    public ResponseEntity<Void> deleteTeam(@PathVariable int teamId) {
        try {
            teamServiceImplJpa.deleteTeam(teamId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SQLException e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Team>> getAllTeamsFromArrayList() {
        List<Team> teamList = teamServiceImplArraylist.getAllTeams();
        return new ResponseEntity<>(teamList, HttpStatus.OK);
    }

    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addTeamToArrayList(@RequestBody Team team) {
        int listSize = teamServiceImplArraylist.addTeam(team);
        return new ResponseEntity<>(listSize, HttpStatus.CREATED);
    }

    @GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Team>> getAllTeamsSortedByNameFromArrayList() {
        List<Team> teamList = teamServiceImplArraylist.getAllTeamsSortedByName();
        return new ResponseEntity<>(teamList, HttpStatus.OK);
    }
}
=======
 
import com.wecp.progressive.entity.Team;
import com.wecp.progressive.service.impl.TeamServiceImplArraylist;
import com.wecp.progressive.service.impl.TeamServiceImplJpa;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
 
import java.sql.SQLException;
import java.util.List;
@RestController
@RequestMapping("/team")
public class TeamController {
 
    @Autowired
    private TeamServiceImplArraylist teamServiceImplArraylist;
 
    @Autowired
    private TeamServiceImplJpa teamServiceImplJpa;
   
    @GetMapping
    public ResponseEntity<List<Team>> getAllTeams() {
        return null;
       
    }
 
    @GetMapping("/{teamID}")
    public ResponseEntity<Team> getTeamById( @PathVariable int teamId) throws SQLException {
        return null;
       
    }
 
    @PostMapping
    public ResponseEntity<Integer> addTeam(@RequestBody Team team) {
        return null;
       
    }
 
    @PutMapping("/{teamID}")
    public ResponseEntity<Void> updateTeam(@PathVariable int teamId, @RequestBody Team team) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
 
    @DeleteMapping("/{teamID}")
    public ResponseEntity<Void> deleteTeam(@PathVariable int teamId) {
        return new ResponseEntity<Void>(HttpStatus.OK);
    }
    @GetMapping("/fromArrayList")
    public ResponseEntity<List<Team>> getAllTeamsFromArrayList() {
        return new ResponseEntity<List<Team>>(teamServiceImplArraylist.getAllTeams(), HttpStatus.OK);
    }
    @PostMapping("/toArrayList")
    public ResponseEntity<Integer> addTeamToArrayList(Team team) {
        return new ResponseEntity<>(teamServiceImplArraylist.addTeam(team), HttpStatus.CREATED);
    }
    @GetMapping("/fromArrayList/sorted")
    public ResponseEntity<List<Team>> getAllTeamsSortedByNameFromArrayList() {
        return new ResponseEntity<>(teamServiceImplArraylist.getAllTeamsSortedByName(), HttpStatus.OK);
    }
}
>>>>>>> 6d9f8fb4927edf91f75ad2579f6b8862474886c6
